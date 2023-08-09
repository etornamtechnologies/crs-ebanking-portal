package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.dto;

/**
 * @author Etornam Ernest Anyidoho
 */
public class ResponseDTO<T> {
    private Integer errCode;
    private String errMsg;

    private T data;
}
