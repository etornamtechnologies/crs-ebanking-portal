package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CSVW_ALL_TXN_LOG")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSVW_ALL_TXN_LOG {
    @Id
    public String PROVIDER;
    public String FROM_CUST_ID;
    public String TXN_AMT;
    public String TRANS_ID;
    public String TXN_DESC;
    public String CCY;
    public Date TRN_DT;
    public Integer STATUS;
    public String REF_NUM;
    public String TO_CUST_ID;
}
