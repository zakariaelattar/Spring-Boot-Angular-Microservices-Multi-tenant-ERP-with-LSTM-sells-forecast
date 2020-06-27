package org.sid.can_db_handler_service.Repositories.Categorie;

import org.sid.can_db_handler_service.Entities.Categorie.Categorie_product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Categorie_productRepository extends JpaRepository<Categorie_product,Integer> {
}
