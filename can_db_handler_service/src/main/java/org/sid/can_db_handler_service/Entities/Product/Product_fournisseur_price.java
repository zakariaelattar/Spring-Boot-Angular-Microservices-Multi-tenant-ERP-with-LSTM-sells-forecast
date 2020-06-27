package org.sid.can_db_handler_service.Entities.Product;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.User.CanUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
