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
@Table(name = "REGISTRATION")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class REGISTRATION {
    @Id
    public String REF_NUM;
    public String FIRST_NAME;
    public String LAST_NAME;
    public String MIDDLE_NAME;
    public String PREFFERED_NAME;
    public String OTHER_CUSTOMER_ID;
    public String OTHER_COMPANY_NAME;
    public String ADDRESS1;
    public String ADDRESS2;
    public String ADDRESS3;
    public String CITY;
    public String COUNTRY;
    public String STATE_REGION;
    public String POSTAL_CODE;
    public String BRITH_DATE;
    public String ID_TYPE;
    public String ID_VALUE;
    public String MOBILE_PHONE_NUMBER;
    public String ALTERNATE_PHONE_NUMBER;
    public String EMAIL_ADDRESS;
    public String CUSTOMER_SOURCE;
    public String REFERRED_BY;
    public String SUB_COMPANY;
    public Date REGISTRATION_DATE;
    public String CUSTOMER_ID;
    public String PRODUCT_BIN;
    public String SEX;
    public String SECRET_QUESTION;
    public String SECRET_ANS;
    public String FLEX_ACCOUNT;
    public String FLEX_ACC_CCY;
    public String ACCT_CLASS;
    public String REQUEST_TYPE;
    public String FLEX_ACC_BRANCH;
    public String REASON_CODE;
    public String BIRTH_PLACE;
    public Integer ACCT_TYPE;
    public Integer FIN_PROF;
    public Double LIMIT;
    public String GENERATE;
}
