package com.fasylgroup.engineering.crsebanking.EbankingPortalService.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author Etornam Ernest Anyidoho
 */
@Component
public class AuthFacade implements IAuthFacade {
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
