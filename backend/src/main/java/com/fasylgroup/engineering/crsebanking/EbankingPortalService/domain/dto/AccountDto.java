package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Etornam Ernest Anyidoho
 */
public class AccountDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginRequest {
        private String username;
        private String password;
    }

}
