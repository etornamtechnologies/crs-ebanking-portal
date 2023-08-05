package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "ACTM_EMP_TYPE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ACTM_EMP_TYPE {
    @Id
    private String type;
    private String description;
}
