package org.cannonerp.can_purshase_sell_service.Entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_price")

public class Product_price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date tms;
    @ManyToOne
    private Product product;
    private Date date_price;
    private int price_level;
    private double price;
    private double price_ttc;
    private double price_min;
    private double price_min_ttc;
    private String price_base_type;
    private double tva_tx;
    private int recuperableonly;
    private double localtax1_tx;
    private double localtax2_tx;
    /*foring key a faire
    private int fk_user_author;
    end
     */
    private int tosell;
}
