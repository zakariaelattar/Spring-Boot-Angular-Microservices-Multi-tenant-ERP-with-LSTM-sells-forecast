package org.sid.cannonerp.can_db_handler_service.Repositories;


import org.sid.cannonerp.can_db_handler_service.Entities.Product_supplier_log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface Product_supplier_logRepository extends JpaRepository<Product_supplier_log,Long> {
}
