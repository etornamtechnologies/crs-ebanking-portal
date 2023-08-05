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
@Table(name = "AMS_TRANSFERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AMS_TRANSFERS {
    @Id
    public String referenceNo;
    public String accountNo;
    public String phoneNumber;
    public String branchCode;
    public String firstName;
    public String lastName;
    public String makerId;
    public Date requestTimestamp;
    public String status;
    public Double amount;
    public String extRefNo;
    public Integer errCode;
}
