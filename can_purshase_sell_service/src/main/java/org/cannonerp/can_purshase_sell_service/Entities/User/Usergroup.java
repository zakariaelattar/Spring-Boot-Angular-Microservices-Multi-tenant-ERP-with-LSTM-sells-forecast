package org.cannonerp.can_purshase_sell_service.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_usergroup")
public class Usergroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String nom;
    private int entity;
    private Date datec;
    private Date tms;
    private String note;
    @OneToMany(mappedBy = "usergroup" , fetch = FetchType.LAZY)
    private Set<Usergroup_rights> usergroup_rights;
    @OneToMany(mappedBy = "usergroup" , fetch = FetchType.LAZY)
    private Set<Usergroup_user> usergroup_users;
}
