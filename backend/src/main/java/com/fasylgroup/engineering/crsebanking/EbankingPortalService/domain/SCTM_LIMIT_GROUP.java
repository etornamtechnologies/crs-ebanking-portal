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
@Table(name = "SCTM_LIMIT_GROUP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SCTM_LIMIT_GROUP {
    @Id
    private Integer code;
    private String name;
    private String limitType;
}
