package org.cannonerp.can_product_service.Repositories;


import org.cannonerp.can_product_service.Entities.Product_supplier_price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface Product_supplier_priceRepository extends JpaRepository<Product_supplier_price,Long> {
}
