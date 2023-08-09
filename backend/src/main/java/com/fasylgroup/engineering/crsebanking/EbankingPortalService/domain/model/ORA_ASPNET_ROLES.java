package com.fasylgroup.engineering.crsebanking.EbankingPortalService.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

/**
 * @author Etornam Ernest Anyidoho
 */
@Entity
@Table(name = "ORA_ASPNET_ROLES")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ORA_ASPNET_ROLES {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "uuid")
    @Column(length = 32 , updatable = false, nullable = false, name = "ROLEID")
    private String roleId;
    @Column(name = "APPLICATIONID")
    private String applicationId;
    @Column(name = "ROLENAME")
    private String roleName;
    @Column(name = "LOWEREDROLENAME")
    private String loweredRoleName;
    private String description;
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private List<ORA_ASPNET_USERS> users;
}
