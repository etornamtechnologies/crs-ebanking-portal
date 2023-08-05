package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "UMTB_ADD_USERINFO")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UMTB_ADD_USERINFO {
    @Id
    public String USERNAME;
    public String ACCOUNT;
    public String BRANCH;
    public String CUST_ID;
    public String FULLNAME;
    public String LIMIT;
    public Date DATE_CREATED;
    public Date DATE_MODIFIED;
    public Date DATE_ACTIVATED;
    public String CREATED_BY;
    public String MODIFIED_BY;
    public String ACTIVATED_BY;
    public String USD_ACCOUNT;
}
