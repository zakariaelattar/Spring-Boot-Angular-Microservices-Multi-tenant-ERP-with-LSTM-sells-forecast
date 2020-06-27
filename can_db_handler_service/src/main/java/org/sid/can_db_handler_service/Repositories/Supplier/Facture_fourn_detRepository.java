package org.sid.can_db_handler_service.Repositories.Supplier;

import org.sid.can_db_handler_service.Entities.Supplier.Facture_fourn_det;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Facture_fourn_detRepository extends JpaRepository<Facture_fourn_det,Integer> {
}
