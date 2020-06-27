package org.cannonerp.can_purshase_sell_service.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_usergroup_user")
public class Usergroup_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private CanUser user;
    @ManyToOne
    private Usergroup usergroup;
}
