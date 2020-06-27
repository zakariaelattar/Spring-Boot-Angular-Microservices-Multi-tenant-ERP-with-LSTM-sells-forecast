package org.cannonerp.can_purshase_sell_service.Entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_purshase_sell_service.Entities.User.CanUser;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_fournisseur_price_log")

public class Product_fournisseur_price_log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date datec;
    /*foring key a faire
    private int fk_product_fournisseur;
    end
     */
    private double price;
    private double quantity;
    @ManyToOne
    private CanUser user;
}
