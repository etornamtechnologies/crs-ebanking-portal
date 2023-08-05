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
@Table(name = "SCTM_FIN_PROF")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_FIN_PROF {
    @Id
    public Integer CODE;
    public String FEE_PROFILE;
    public String STATUS;
}
