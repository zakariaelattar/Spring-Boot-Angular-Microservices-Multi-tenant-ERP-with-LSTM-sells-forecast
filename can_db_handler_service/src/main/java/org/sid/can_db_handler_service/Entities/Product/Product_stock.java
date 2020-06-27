package org.sid.can_db_handler_service.Entities.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
