package org.sid.can_db_handler_service.Entities.User;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
