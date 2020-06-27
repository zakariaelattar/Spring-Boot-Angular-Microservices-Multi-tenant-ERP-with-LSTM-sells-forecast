package org.cannonerp.can_purshase_sell_service.Entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_categorie_fournisseur")
public class Categorie_fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Categorie categorie;
    /*foring key a faire
    private int fk_societe;
    end
     */
}
