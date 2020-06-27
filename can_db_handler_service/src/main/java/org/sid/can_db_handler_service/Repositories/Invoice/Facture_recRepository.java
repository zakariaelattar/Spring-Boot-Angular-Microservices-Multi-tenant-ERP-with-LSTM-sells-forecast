package org.sid.can_db_handler_service.Repositories.Invoice;

import org.sid.can_db_handler_service.Entities.Invoice.Facture_rec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Facture_recRepository extends JpaRepository<Facture_rec,Integer> {
}
