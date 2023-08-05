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
@Table(name = "CSVW_REGISTERED_MEMBERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSVW_REGISTERED_MEMBERS {
    @Id
    public String REF_NUM;
    public String FIRST_NAME;
    public String LAST_NAME;
    public String PREFFERED_NAME;
    public String ADDRESS1;
    public String BRITH_DATE;
    public String ID_TYPE;
    public String ID_VALUE;
    public String MOBILE_PHONE_NUMBER;
    public String EMAIL_ADDRESS;
    public String PRODUCT_BIN;
    public String SEX;
    public String FLEX_ACCOUNT;
    public String FLEX_ACC_CCY;
    public String FLEX_ACC_BRANCH;
    public String REASON_CODE;
    public String GENERATE;
    public String PROVIDER;
    public Date REQUEST_DATE;
    public String CLIENT_ID;
    public String APP_USER_ID;
}
