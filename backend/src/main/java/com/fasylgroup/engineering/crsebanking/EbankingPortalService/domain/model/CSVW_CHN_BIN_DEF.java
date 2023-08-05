package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CSVW_CHN_BIN_DEF")
public class CSVW_CHN_BIN_DEF {
    @Id
    public String ACQ_ID;
    public String BIN_CODE;
    public String CASH_ACCT;
    public String DFLT_STTL_ACCT;
    public String ACQ_ACCT;
    public String CHANNEL_CODE;
    public String TXN_TYPE;
}
