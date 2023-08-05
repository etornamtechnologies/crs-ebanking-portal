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
@Table(name = "AMTB_CASH_OUT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AMTB_CASH_OUT {
    @Id
    public String pkey ;
    public Date initiatedOn;
    public String status;
    public Date cashedOn;
    public String sendersFullName;
    public String recipientsFullName;
    public String idType;
    public String idNumber;
}
