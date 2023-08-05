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
@Table(name = "CLIENT_SERVICES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CLIENT_SERVICES {
    @Id
    public String CLIENT_ID;
    public String SERVICES;
}
