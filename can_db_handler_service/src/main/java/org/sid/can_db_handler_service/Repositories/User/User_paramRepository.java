package org.sid.can_db_handler_service.Repositories.User;

import org.sid.can_db_handler_service.Entities.User.User_param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface User_paramRepository extends JpaRepository<User_param,Integer> {
}
