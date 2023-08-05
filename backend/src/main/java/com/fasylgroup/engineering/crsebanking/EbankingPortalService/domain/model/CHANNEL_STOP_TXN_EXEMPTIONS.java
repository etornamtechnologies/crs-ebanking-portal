package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CHANNEL_STOP_TXN_EXEMPTIONS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CHANNEL_STOP_TXN_EXEMPTIONS {
    @Id
    public String MSG_TYPE;
    public String ENTRY_MODE;
    public String AC_NO;
    public Date ADDED_ON;
    public String ADDED_BY;
}
