package org.sid.can_db_handler_service.Repositories.Order;

import org.sid.can_db_handler_service.Entities.Order.Commandedet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandedetRepository extends JpaRepository<Commandedet,Integer> {
}
