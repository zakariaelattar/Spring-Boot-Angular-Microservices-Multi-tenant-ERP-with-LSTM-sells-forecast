package org.cannonerp.can_tiers_service.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_rights_def")
public class Rights_def {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private int entity;
    private String libelle;
    private String module;
    private String perms;
    private String subperms;
    private String type;
    private int bydefault;
}
