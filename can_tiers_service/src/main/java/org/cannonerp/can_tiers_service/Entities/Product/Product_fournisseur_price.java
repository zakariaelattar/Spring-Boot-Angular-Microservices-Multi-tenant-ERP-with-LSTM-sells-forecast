package org.cannonerp.can_tiers_service.Entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_tiers_service.Entities.User.CanUser;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_fournisseur_price")

public class Product_fournisseur_price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date datec;
    private Date tms;
    /*foring key a faire
    private int fk_product_fournisseur;
    end
     */
    private double price;
    private double quantity;
    private double unitprice;
    @ManyToOne
    private CanUser user;
}
