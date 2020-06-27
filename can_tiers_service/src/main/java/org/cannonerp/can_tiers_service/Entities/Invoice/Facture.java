package org.cannonerp.can_tiers_service.Entities.Invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String facnumber;
    private int entity;
    private int type;
    private String ref_client;
    private String increment;
    /*foring key a faire
    fk_soc			int(11)
     */
    private Date datec;
    private Date datef;
    private Date date_valid;
    private Date tms;
    private int paye;
    private double amount;
    private double remise_percent;
    private double remise_absolue;
    private double remise;
    private String close_code;
    private String close_note;
    private double tva;
    private double localtax1;
    private double localtax2;
    private double total;
    private double total_ttc;
    /*foring key a faire
    fk_statut		smallint(6)
    fk_user_author		int(11)
    fk_user_valid		int(11)
    fk_facture_source	int(11)
    fk_projet		int(11)
    fk_cond_reglement	int(11)
    fk_mode_reglement	int(11)
     */
    private Date date_lim_reglement;
    private String note;
    private String note_public;
    private String model_pdf;
    private String import_key;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Facturedet> facturedets;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Facturedet_rec> facturedet_recs;
}
