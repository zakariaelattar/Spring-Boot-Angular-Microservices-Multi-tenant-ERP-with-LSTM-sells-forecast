package org.sid.can_db_handler_service.Repositories.Order;

import org.sid.can_db_handler_service.Entities.Order.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande,Integer> {
}
