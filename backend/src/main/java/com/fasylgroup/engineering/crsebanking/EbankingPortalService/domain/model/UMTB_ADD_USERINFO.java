package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "UMTB_ADD_USERINFO")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UMTB_ADD_USERINFO {
    @Id
    public String USERNAME;
    public String ACCOUNT;
    public String BRANCH;
    public String CUST_ID;
    public String FULLNAME;
    @Column(name = "MLIMIT")
    public String LIMIT;
    public Timestamp DATE_CREATED;
    public Timestamp DATE_MODIFIED;
    public Timestamp DATE_ACTIVATED;
    public String CREATED_BY;
    public String MODIFIED_BY;
    public String ACTIVATED_BY;
    public String USD_ACCOUNT;

    @JsonIgnore
    @OneToOne(mappedBy = "userInfo")
    private ORA_ASPNET_USERS user;
}
