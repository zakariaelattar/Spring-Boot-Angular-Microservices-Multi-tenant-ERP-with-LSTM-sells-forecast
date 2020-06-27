package org.sid.can_db_handler_service.Entities.Supplier;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.Order.Commande;
import org.sid.can_db_handler_service.Entities.Product.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_commande_fournisseurdet")
public class Commande_fournisseurdet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Product product;
    private String ref;
    private String label;
    private String description;
    private double tva_tx;
    private double localtax1_tx;
    private double localtax2_tx;
    private double qty;
    private double remise_percent;
    private double remise;
    private double subprice;
    private double total_ht;
    private double total_tva;
    private double total_localtax1;
    private double total_localtax2;
    private double total_ttc;
    private int product_type;
    private Date date_start;
    private Date date_end;
    private int info_bits;
}
