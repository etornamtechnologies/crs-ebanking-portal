package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "SCTM_ACCT_TYPES")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_ACCT_TYPES {
    @Id
    public Integer CODE;
    public String NAME;
    public String STATUS;
}
