package org.sid.can_db_handler_service.Repositories.Invoice;

import org.sid.can_db_handler_service.Entities.Invoice.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FactureRepository extends JpaRepository<Facture,Integer> {
}
