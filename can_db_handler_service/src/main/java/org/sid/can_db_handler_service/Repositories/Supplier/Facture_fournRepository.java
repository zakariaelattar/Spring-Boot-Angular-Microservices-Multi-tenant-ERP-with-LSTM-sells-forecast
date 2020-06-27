package org.sid.can_db_handler_service.Repositories.Supplier;

import org.sid.can_db_handler_service.Entities.Supplier.Facture_fourn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Facture_fournRepository extends JpaRepository<Facture_fourn,Integer> {
}
