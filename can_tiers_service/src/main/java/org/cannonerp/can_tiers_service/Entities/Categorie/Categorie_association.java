package org.cannonerp.can_tiers_service.Entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_categorie_association")
public class Categorie_association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    /*foring key a faire
    private int fk_categorie_mere;
    &
    private int fk_categorie_fille;
    end
     */
}
