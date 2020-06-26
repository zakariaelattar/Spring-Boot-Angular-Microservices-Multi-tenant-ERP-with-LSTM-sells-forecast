package org.sid.cannonerp.can_db_handler_service.Repositories;




import org.sid.cannonerp.can_db_handler_service.Entities.Product_stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface Product_stockRepository extends JpaRepository<Product_stock,Long> {
}
