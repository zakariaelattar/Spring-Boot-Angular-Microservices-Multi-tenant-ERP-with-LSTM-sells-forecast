package org.sid.can_db_handler_service.Entities.Supplier;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.Order.Commande;
import org.sid.can_db_handler_service.Entities.User.CanUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_commande_fournisseur_log")
public class Commande_fournisseur_log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date tms;
    private Date datelog;
    @ManyToOne
    private Commande commande;
    /*foring key a faire
    fk_statut		smallint(6)
     */
    @ManyToOne
    private CanUser user;
    private String comment;
}
