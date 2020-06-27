package org.sid.can_db_handler_service.Entities.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_lot")

public class Product_lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
}
