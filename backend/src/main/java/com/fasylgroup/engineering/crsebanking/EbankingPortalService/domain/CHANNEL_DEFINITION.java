package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "CHANNEL_DEFINITION")
@Data
public class CHANNEL_DEFINITION {
    @Id
    public String channelCode;
    public String termId;
    public String binCode;
    public String termBranch;
    public String acqId;
    public String txnCode;
    public String dfltSttlAcct;
    public String issuerAcct;
    public String acqAcct;
    public String fwderAcct;
    public String cashAcct;
    public String allowCcy;
    public String makerid;
    public String checkerid;
    public String mntStatus;
    public String txnType;
}
