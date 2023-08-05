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
@Table(name = "ON_US_GLS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ON_US_GLS {
    @Id
    public Integer CODE;
    public String GL_ACCT;
    public String DESCRIP;
}
