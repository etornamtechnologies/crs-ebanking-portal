package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

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
@Table(name = "CHANNEL_STOP_TXN_EXEMP_HIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CHANNEL_STOP_TXN_EXEMP_HIST {
    @Id
    public String guid;
    public String msgType;
    public String entryMode;
    public String acNo;
    public Date addedOn;
    public String addedBy;
    public Date deletedOn;
    public String deletedBy;
}
