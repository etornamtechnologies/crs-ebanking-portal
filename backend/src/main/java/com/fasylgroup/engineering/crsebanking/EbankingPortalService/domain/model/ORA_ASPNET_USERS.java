package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "ORA_ASPNET_USERS")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ORA_ASPNET_USERS implements UserDetails {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "uuid")
    @Column(name = "USERID", length = 32 , updatable = false, nullable = false)
    private String userId;
    @Column(name = "APPLICATIONID")
    private String applicationId;
    private String username;
    @Column(name = "LOWEREDUSERNAME")
    private String loweredUsername;
    @Column(name = "MOBILEALIAS")
    private String mobileAlias;
    @Column(name = "ISANONYMOUS")
    private String isAnonymous;
    @Column(name = "LASTACTIVITYDATE")
    private String lastActivityDate;
    @OneToOne
    @JoinColumn(name = "UMTB_ADD_USERINFO_ID", nullable = false)
    private UMTB_ADD_USERINFO userInfo;
    @ToString.Exclude
    @ManyToMany
    @JoinTable(
            name = "ORA_ASPNET_USERSINROLES",
            joinColumns = @JoinColumn(name = "USERID"),
            inverseJoinColumns = @JoinColumn(name = "ROLEID")
    )
    private List<ORA_ASPNET_ROLES> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        HashSet authorities = new HashSet<GrantedAuthority>(roles.size());
        for(ORA_ASPNET_ROLES role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return Collections.unmodifiableSet(authorities);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
