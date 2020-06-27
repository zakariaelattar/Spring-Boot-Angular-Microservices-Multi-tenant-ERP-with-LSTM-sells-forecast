package org.sid.can_db_handler_service.Repositories.Supplier;

import org.sid.can_db_handler_service.Entities.Supplier.Commande_fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Commande_fournisseurRepository extends JpaRepository<Commande_fournisseur,Integer> {
}
