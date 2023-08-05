package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CHANNEL_BIN_MAINT")
public class CHANNEL_BIN_MAINT {
    @Id
    public String channelCode;
    public String binCode;
    public String makerId;
    public String checkerId;
    public String mntStatus;
    public String acqId;
    public String txnType;
    public String cardType;
}
