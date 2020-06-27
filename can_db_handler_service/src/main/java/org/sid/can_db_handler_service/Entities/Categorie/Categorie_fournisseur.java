package org.sid.can_db_handler_service.Entities.Categorie;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
