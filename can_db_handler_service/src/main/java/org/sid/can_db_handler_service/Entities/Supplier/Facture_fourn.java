package org.sid.can_db_handler_service.Entities.Supplier;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_facture_fourn")
public class Facture_fourn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String facnumber;
    private int entity;
    private int type;
    /*foring key a faire
    fk_soc			int(11)
     */
    private Date datec;
    private Date datef;
    private Date tms;
    private String libelle;
    private int paye;
    private double amount;
    private double remise;
    private String close_code;
    private String close_note;
    private double tva;
    private double localtax1;
    private double localtax2;
    private double total;
    private double total_ht;
    private double total_tva;
    private double total_ttc;
    /*foring key a faire
    fk_statut		smallint(6)
    fk_user_author		int(11)
    fk_user_valid		int(11)
    fk_facture_source	int(11)
    fk_projet		int(11)
    fk_cond_regelement	int(11)
     */
    private int date_lim_reglement;
    private String note;
    private String note_public;
    private String import_key;
    @OneToMany(mappedBy = "facture_fourn" , fetch = FetchType.LAZY)
    private Set<Facture_fourn_det> facture_fourn_dets;
}
