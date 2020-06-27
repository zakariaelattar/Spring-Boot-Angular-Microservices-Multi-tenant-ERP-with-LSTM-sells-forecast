package org.cannonerp.can_purshase_sell_service.Entities.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_purshase_sell_service.Entities.Order.Commande;
import org.cannonerp.can_purshase_sell_service.Entities.User.CanUser;

import javax.persistence.*;
import java.util.Date;

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
