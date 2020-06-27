package org.cannonerp.can_purshase_sell_service.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_user_param")
public class User_param {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @OneToOne
    private CanUser user;
    private int entity;
    private String param;
    private String value;
}
