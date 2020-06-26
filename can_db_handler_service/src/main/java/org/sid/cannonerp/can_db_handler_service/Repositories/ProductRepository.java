package org.sid.cannonerp.can_db_handler_service.Repositories;


import org.sid.cannonerp.can_db_handler_service.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findProductByRef(String pro1);
}
