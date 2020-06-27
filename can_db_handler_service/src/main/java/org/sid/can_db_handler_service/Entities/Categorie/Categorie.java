package org.sid.can_db_handler_service.Entities.Categorie;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entites.Bank.Bank_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String label;
    private int type;
    private int entity;
    private String description;
    /*foring key a faire
    private int fk_soc;
    end
     */
    private int visible;
    @OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
    private Set<Bank_class> bank_classes;
    @OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
    private Set<Categorie_fournisseur> categorie_fournisseurs;
    @OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
    private Set<Categorie_member> categorie_members;
    @OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
    private Set<Categorie_product> categorie_products;
    @OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
    private Set<Categorie_societe> categorie_societes;
}
