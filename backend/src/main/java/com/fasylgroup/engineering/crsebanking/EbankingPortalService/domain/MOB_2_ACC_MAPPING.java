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
@Table(name = "MOB_2_ACC_MAPPING")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MOB_2_ACC_MAPPING {
    @Id
    public String REFERENCE_NO;
    public String ACCOUNT_NO;
    public String BRANCH_CODE;
    public String FIRST_NAME;
    public String LAST_NAME;
    public Date REQUEST_TIMESTAMP;
    public String MAKER_ID;
    public String STATUS;
    public String PHONE_NUMBER;
    public String EXT_REF_NO;
    public String EMAIL;
    public Integer ERR_CODE;
}
