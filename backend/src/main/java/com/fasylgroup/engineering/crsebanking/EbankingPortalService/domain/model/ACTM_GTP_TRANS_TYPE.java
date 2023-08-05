package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "ACTM_GTP_TRANS_TYPE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ACTM_GTP_TRANS_TYPE {
    @Id
    private String transCode;
    private String description;
}
