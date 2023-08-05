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
@Table(name = "CSVW_FLEX_GL_ACCOUNTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSVW_FLEX_GL_ACCOUNTS {
    @Id
    private String glCode;
    private String glDesc;
}
