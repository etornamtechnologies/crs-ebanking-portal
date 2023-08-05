package com.fasylgroup.engineering.crsebanking.EbankingPortalService.security;

import org.springframework.security.core.Authentication;

/**
 * @author Etornam Ernest Anyidoho
 */
public interface IAuthFacade {
    Authentication getAuthentication();
}
