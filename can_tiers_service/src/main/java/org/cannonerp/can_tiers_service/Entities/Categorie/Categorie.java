package org.cannonerp.can_tiers_service.Entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_tiers_service.Entities.Bank.Bank_class;


import javax.persistence.*;
import java.util.Set;

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
