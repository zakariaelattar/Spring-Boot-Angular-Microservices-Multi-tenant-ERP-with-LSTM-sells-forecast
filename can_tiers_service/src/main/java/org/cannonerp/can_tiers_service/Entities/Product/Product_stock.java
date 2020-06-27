package org.cannonerp.can_tiers_service.Entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_stock")

public class Product_stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String tms;
    @ManyToOne
    private Product product;
    /*foring key a faire
    private int fk_entrepot;
    end
     */
    private double reel;
    private double pmp;
}
