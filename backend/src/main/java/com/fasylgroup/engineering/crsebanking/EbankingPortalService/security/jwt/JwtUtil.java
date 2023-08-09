package com.fasylgroup.engineering.crsebanking.EbankingPortalService.security.jwt;

import com.etxgroup.engineering.LabManagementBackOfficeService.domain.model.BoUser;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
@Slf4j
@AllArgsConstructor
public class JwtUtil {
    private JwtConfig jwtConfig;
    public String generateJwtAccessToken(BoUser user) {
        log.info("JWT CONFIG: " + jwtConfig.getTokenExpirationAfterDays());
        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuer("ETXEASYPOS")
                .claim("role", user.getRole().toString())
                .claim("authorities", user.getAuthorities())
                //.setExpiration(java.sql.Date.valueOf(String.valueOf(LocalDateTime.now().plusDays(jwtConfig.getTokenExpirationAfterDays()))))
                .signWith(getSigningKey(jwtConfig.getSecretKey()))
                .compact();
    }

    public boolean validateJwtAccessToken(String token) {
        log.info("-------->JWT CONFIG: " + jwtConfig.toString());
        try {
            Jwts.parser().setSigningKey(jwtConfig.getSecretKey()).parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException ex) {
            log.error("JWT expired", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.error("Token is null, empty or only whitespace", ex.getMessage());
        } catch (MalformedJwtException ex) {
            log.error("JWT is invalid", ex);
        } catch (UnsupportedJwtException ex) {
            log.error("JWT is not supported", ex);
        } catch (SignatureException ex) {
            log.error("Signature validation failed");
        }

        return false;
    }

    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    public Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(jwtConfig.getSecretKey())
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSigningKey(String secret) {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }


}
