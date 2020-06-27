package org.sid.can_db_handler_service.Entities.Categorie;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
