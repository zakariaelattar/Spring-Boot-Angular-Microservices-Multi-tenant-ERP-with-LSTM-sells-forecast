package org.cannonerp.can_purshase_sell_service.Entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_product_batch")

public class Product_batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
}
