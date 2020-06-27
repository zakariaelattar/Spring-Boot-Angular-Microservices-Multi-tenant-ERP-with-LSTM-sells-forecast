package org.cannonerp.can_purshase_sell_service.Entities.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_purshase_sell_service.Entities.Supplier.Commande_fournisseur_log;
import org.cannonerp.can_purshase_sell_service.Entities.Supplier.Commande_fournisseurdet;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date tms;
    /*foring key a faire
    fk_soc			int(11)
    fk_projet		int(11)
     */
    private String ref;
    private int entity;
    private String ref_client;
    private Date date_creation;
    private Date date_valid;
    private Date date_cloture;
    private Date date_commande;
    /*foring key a faire
    fk_user_author		int(11)
    fk_user_valid		int(11)
    fk_user_cloture		int(11)
     */
    private int source;
    /*foring key a faire
    fk_statut		smallint(6)
     */
    private double amount_ht;
    private double remise_percent;
    private double remise_absolue;
    private double remise;
    private double tva;
    private double localtax1;
    private double localtax2;
    private double total_ht;
    private double total_ttc;
    private String note;
    private String note_public;
    private String model_pdf;
    private int facture;
    /*foring key a faire
    fk_cond_reglement	int(11)
    fk_mode_reglement	int(11)
    */
    private Date date_livraison;
    /*foring key a faire
    fk_adresse_livraison	int(11)
    end
     */
    private String import_key;
    @OneToMany(mappedBy = "commande" , fetch = FetchType.LAZY)
    private Set<Commandedet> commandedets;
    @OneToMany(mappedBy = "commande" , fetch = FetchType.LAZY)
    private Set<Commande_fournisseur_log> commande_fournisseur_logs;
    @OneToMany(mappedBy = "commande" , fetch = FetchType.LAZY)
    private Set<Commande_fournisseurdet> commande_fournisseurdets;
}
