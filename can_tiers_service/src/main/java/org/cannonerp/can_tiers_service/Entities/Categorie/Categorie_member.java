package org.cannonerp.can_tiers_service.Entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_categorie_member")
public class Categorie_member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Categorie categorie;
    /*foring key a faire
    private int fk_member;
    end
     */
}
