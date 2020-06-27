package org.sid.can_db_handler_service.Entities.Product;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.Categorie.Categorie_product;
import org.sid.can_db_handler_service.Entities.Invoice.Facturedet;
import org.sid.can_db_handler_service.Entities.Invoice.Facturedet_rec;
import org.sid.can_db_handler_service.Entities.Order.Commandedet;
import org.sid.can_db_handler_service.Entities.Supplier.Commande_fournisseurdet;
import org.sid.can_db_handler_service.Entities.Supplier.Facture_fourn_det;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date datec;
    private Date tms;
    private int virtual;
    /*foring key a faire
    private int fk_parent;
    end */
    private String ref;
    private int entity;
    private String label;
    private String description;
    private String note;
    private double price;
    private double price_ttc;
    private double price_min;
    private double price_min_ttc;
    private String price_base_type;
    private double tva_tx;
    private int recuperableonly;
    private double localtax1_tx;
    private double localtax2_tx;
    /* foring key a faire
    private int fk_user_author;
    end
     */
    private int tosell;
    private int tobuy;
    /* foring key a faire
    private int fk_product_type;
    end
     */
    private String duration;
    private int seuil_stock_alerte;
    private String barcode;
    /*foring key a faire
    private int fk_barcode_type;
    end
     */
    private String accountancy_code_sell;
    private String accountancy_code_buy;
    private String partnumber;
    private float weight;
    private int weight_units;
    private float length;
    private int length_units;
    private float surface;
    private int surface_units;
    private float volume;
    private int volume_units;
    private int stock;
    private double pmp;
    private String canvas;
    private int finished;
    private int hidden;
    private String import_key;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Categorie_product> categorie_products;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Facturedet> facturedets;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Facturedet_rec> facturedet_recs;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Commandedet> commandedets;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Product_price> product_prices;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Product_stock> product_stocks;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Commande_fournisseurdet> commande_fournisseurdets;
    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private Set<Facture_fourn_det> facture_fourn_dets;






}
