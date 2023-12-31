package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Column;
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
@Table(name = "CSVW_EMP_REG")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSVW_EMP_REG {
    @Id
    public String REF_NUM;
    public String PRODUCT_BIN;
    public String FIRST_NAME;
    public String SEX;
    public String BRITH_DATE;
    public String BIRTH_PLACE;
    public String COUNTRY;
    public String ADDRESS1;
    public String MOBILE_PHONE_NUMBER;
    public String SECRET_QUESTION;
    public String SECRET_ANS;
    public String PREFFERED_NAME;
    public String FLEX_ACCOUNT;
    public String FLEX_ACC_CCY;
    public Date REG_DATE;
    public Integer STATUS;
    public String REQUEST_TYPE;
    public String REASON_CODE;
    public String ACCT_CLASS;
    public String FLEX_ACC_BRANCH;
    public Integer ACCT_TYPE;
    public Integer FIN_PROF;
    @Column(name = "MLIMIT")
    public Integer LIMIT;
    public String ID_VALUE;
    public String GENERATE;
}
