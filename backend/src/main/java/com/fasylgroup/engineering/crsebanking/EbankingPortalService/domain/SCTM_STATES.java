package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

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
@Table(name = "SCTM_STATES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_STATES {
    @Id
    public String STATE_CODE;
    public String STATE;
    public String COUNTRY_CODE;
}
