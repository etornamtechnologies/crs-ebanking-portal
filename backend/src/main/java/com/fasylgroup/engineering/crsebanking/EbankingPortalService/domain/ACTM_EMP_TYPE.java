package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

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
@Table(name = "ACTM_EMP_TYPE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ACTM_EMP_TYPE {
    @Id
    private String type;
    private String description;
}
