package org.cannonerp.can_purshase_sell_service.Entities.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_purshase_sell_service.Entities.Product.Product;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_facture_fourn_det")
public class Facture_fourn_det {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Facture_fourn facture_fourn;
    @ManyToOne
    private Product product;
    private String ref;
    private String label;
    private String description;
    private double pu_ht;
    private double pu_ttc;
    private double qty;
    private double tva_tx;
    private double localtax1_tx;
    private double localtax2_tx;
    private double total_ht;
    private double tva;
    private double total_localtax1;
    private double total_localtax2;
    private double total_ttc;
    private int product_type;
    private Date date_start;
    private Date date_end;
    private String import_key;
}
