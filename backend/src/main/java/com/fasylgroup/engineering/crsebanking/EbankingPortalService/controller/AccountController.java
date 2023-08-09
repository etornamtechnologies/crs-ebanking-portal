package com.fasylgroup.engineering.crsebanking.EbankingPortalService.controller;

import com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.dto.AccountDto;
import com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Etornam Ernest Anyidoho
 */
@RestController
@RequestMapping("/api/v1/account")
@Slf4j
public class AccountController {
    @PostMapping("/login")
    public ResponseDTO login(@RequestBody AccountDto.LoginRequest payload) {
        log.info("====== IN LOGIN CRONTROLLER =====");

        return null;
    }

}
