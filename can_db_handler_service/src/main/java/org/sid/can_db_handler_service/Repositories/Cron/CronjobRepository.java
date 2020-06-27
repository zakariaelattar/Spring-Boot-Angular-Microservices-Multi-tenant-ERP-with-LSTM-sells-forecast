package org.sid.can_db_handler_service.Repositories.Cron;

import org.sid.can_db_handler_service.Entities.Cron.Cronjob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CronjobRepository extends JpaRepository<Cronjob,Integer> {
}
