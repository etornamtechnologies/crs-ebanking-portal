package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "SCTM_COUNTRIES")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_COUNTRIES {
    @Id
    public Integer COUNTRY_ID;
    public String COUNTRY_CODE;
    public String COUNTRY;
    public String CURRENCY;
}
