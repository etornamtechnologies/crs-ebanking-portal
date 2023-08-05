package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "SCTM_ISSUE_CAT")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_ISSUE_CAT {
    @Id
    private String code;
    private String catName;
}
