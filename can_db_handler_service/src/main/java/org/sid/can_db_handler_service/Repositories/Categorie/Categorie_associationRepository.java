package org.sid.can_db_handler_service.Repositories.Categorie;

import org.sid.can_db_handler_service.Entities.Categorie.Categorie_association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Categorie_associationRepository extends JpaRepository<Categorie_association,Integer> {
}
