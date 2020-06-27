package org.sid.can_db_handler_service.Repositories.Marketing;

import org.sid.can_db_handler_service.Entities.Marketing.Mailing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MailingRepository extends JpaRepository<Mailing,Integer> {
}
