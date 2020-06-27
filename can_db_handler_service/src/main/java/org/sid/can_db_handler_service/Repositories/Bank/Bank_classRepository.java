package org.sid.can_db_handler_service.Repositories.Bank;

import org.sid.can_db_handler_service.Entites.Bank.Bank_class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Bank_classRepository extends JpaRepository<Bank_class,Integer> {
}
