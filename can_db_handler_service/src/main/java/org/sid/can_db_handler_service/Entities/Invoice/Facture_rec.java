package org.sid.can_db_handler_service.Entities.Invoice;
import java.util.Date;

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
@Table(name="can_facture_rec")
public class Facture_rec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String titre;
    private int entity;
    /*foring key a faire
    fk_soc			int(11)
     */
    private Date datec;
    private double amount;
    private double remise;
    private double remise_percent;
    private double remise_absolue;
    private double tva;
    private double localtax1;
    private double localtax2;
    private double total;
    private double total_ttc;
    /*foring key a faire
    fk_user_author		int(11)
    fk_projet		int(11)
    fk_cond_reglement	int(11)
    fk_mode_reglement	int(11)
     */
    private Date date_lim_reglement;
    private String note;
    private String note_public;
    private char frequency;
    private String last_gen;
}
