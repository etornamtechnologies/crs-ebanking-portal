package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CHANNEL_STOP_TXN")
public class CHANNEL_STOP_TXN {
    @Id
    public String COUNTRY_CODE;
    public String CHANNEL_CODE;
    public String CURRENCY;
    public String PROC_CODE;
    public String TXN_TYPE;
    public String MSG_TYPE;
    public String ENTRY_MODE;
    public String STATUS;
    public Date ADDED_ON;
    public String ADDED_BY;
    public Date MODIFIED_ON;
    public String MODIFIED_BY;
    public String GUID;
}
