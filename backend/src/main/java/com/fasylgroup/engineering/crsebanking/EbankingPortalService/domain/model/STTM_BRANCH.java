package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "STTM_BRANCH")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class STTM_BRANCH {
    @Id
    private String BRANCH_CODE;
    private String BRANCH_NAME;
}
