package org.sid.can_db_handler_service.Repositories.User;

import org.sid.can_db_handler_service.Entities.User.Usergroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsergroupRepository extends JpaRepository<Usergroup,Integer> {
}
