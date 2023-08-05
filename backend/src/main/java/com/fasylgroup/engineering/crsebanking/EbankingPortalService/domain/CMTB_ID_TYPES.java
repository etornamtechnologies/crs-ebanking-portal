package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CMTB_ID_TYPES")
public class CMTB_ID_TYPES {
    @Id
    public String ID_TYPE;
    public String DESCRIPTION;
    public Integer ROW_ORDER;
}
