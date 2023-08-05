package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "STTM_CUST_ACCOUNT")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class STTM_CUST_ACCOUNT {
    @Id
    public String CUST_AC_NO;
    public String BRANCH_CODE;
    public String AC_DESC;
    public String CUST_NO;
    public String CCY;
    public String ACCOUNT_CLASS;
    public String DISPLAY;
}
