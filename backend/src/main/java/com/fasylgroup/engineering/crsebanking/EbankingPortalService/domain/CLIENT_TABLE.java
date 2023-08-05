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
@Table(name = "CLIENT_TABLE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CLIENT_TABLE {
    @Id
    public String CLIENT_ID;
    public String TOKEN;
    public Date REGISTRATION_DATE;
    public String CHANNEL_CARD_NO;
    public String CHANNEL_CUST_ID;
    public String CHANNEL_TRANS_CODE;
}
