package org.sid.can_db_handler_service.Repositories.User;

import org.sid.can_db_handler_service.Entities.User.Usergroup_rights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Usergroup_rightsRepository extends JpaRepository<Usergroup_rights,Integer> {
}
