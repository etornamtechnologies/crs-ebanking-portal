package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

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
@Table(name = "REQUEST_LOG")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class REQUEST_LOG {
    @Id
    public String REF_NUM;
    public String PROVIDER;
    public String REQUEST_TYPE;
    public Date REQUEST_DATE;
    public Integer ERROR_CODE;
    public String ERROR_MESSAGE;
    public Integer STATUS;
    public String CLIENT_ID;
    public String FROM_CUST_ID;
    public String TO_CUST_ID;
    public String APP_USER_ID;
    public String BRANCH;
}
