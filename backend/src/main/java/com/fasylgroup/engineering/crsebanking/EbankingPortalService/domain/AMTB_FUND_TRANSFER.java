package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "AMTB_FUND_TRANSFER")
@Data
public class AMTB_FUND_TRANSFER {
    @Id
    public String guid;
    public String transtype;
    public String trnRefNo;
    public String srcBank;
    public String srcBranch;
    public String srcAccount;
    public String srcName;
    public Double amount;
    public String ccy;
    public String refId;
    public String countryCode;
    public String authNum;
    public String external1;
    public String external2;
    public String destAccount;
    public String destName;
    public String destBank;
    public String destBranch;
    public String senderDate;
    public String smsSrcMsisdn;
    public String tranDetails;
    public String tranId;
    public Integer status;
    public Date transTimestamp;
}
