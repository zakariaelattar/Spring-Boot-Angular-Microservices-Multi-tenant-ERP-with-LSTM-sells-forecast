package org.sid.can_db_handler_service.Entities.Invoice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.Product.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_facturedet_rec")
public class Facturedet_rec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Product product;
    private int product_type;
    private String description;
    private double tva_tx;
    private double localtax1_tx;
    private double localtax2_tx;
    private double qty;
    private double remise_percent;
    private double remise;
    private double subprice;
    private double price;
    private double total_ht;
    private double total_tva;
    private double total_localtax1;
    private double total_localtax2;
    private double total_ttc;
    private int special_code;
    private int rang;
}
