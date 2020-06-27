package org.sid.can_db_handler_service.Repositories.Product;

import org.sid.can_db_handler_service.Entities.Product.Product_fournisseur_price_log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Product_fournisseur_price_logRepository extends JpaRepository<Product_fournisseur_price_log,Integer> {
}
