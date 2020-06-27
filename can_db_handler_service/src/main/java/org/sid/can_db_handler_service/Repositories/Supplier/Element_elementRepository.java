package org.sid.can_db_handler_service.Repositories.Supplier;

import org.sid.can_db_handler_service.Entities.Supplier.Element_element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Element_elementRepository extends JpaRepository<Element_element,Integer> {
}
