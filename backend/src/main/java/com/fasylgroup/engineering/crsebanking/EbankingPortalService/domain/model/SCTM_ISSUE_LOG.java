package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "SCTM_ISSUE_LOG")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_ISSUE_LOG {
    @Id
    public String ID;
    public String CATEGORY;
    public String DESCRIPTION;
    public Date LOG_TIME;
    public String LOGGED_BY;
    public String STATUS;
    public String ASSIGNED_TO;
    public Date ASSIGNED_DATE;
    public Date FIX_DATE;
    public String REMARKS;
    public String CUST_ID;
    public String CUST_NUMBER;
    public String CUST_EMAIL;
    public String CUST_NAME;
    public String FILE_NAME;
}
