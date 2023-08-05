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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SCTM_PRODUCTS")
public class SCTM_PRODUCTS {
    @Id
    public String PRODUCT_NAME;
    public String PRODUCT_CODE;
    public String PRODUCT_TYPE;
    public String IDENTITY;
    public String FEE;
    public String GL_ACCOUNT;
}
