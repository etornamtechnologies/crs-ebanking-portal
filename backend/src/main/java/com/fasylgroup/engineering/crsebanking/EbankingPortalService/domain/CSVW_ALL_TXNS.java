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
@Table(name = "CSVW_ALL_TXNS")
@Data
public class CSVW_ALL_TXNS {
    @Id
    public String IP_ADDRESS;
    public String P_KEY;
    public String XREF;
    public String TXN_AMT;
    public Date REQUEST_DATE;
    public String REQUEST_TYPE;
    public String PROVIDER;
    public Integer STATUS;
    public String FROM_CUST_ID;
    public String TO_CUST_ID;
    public String FROM_ACC;
    public String TO_ACC;
    public String DCN;
    public String TXN_DESC;
    public String APP_USER_ID;
}
