package org.sid.can_db_handler_service.Repositories.Categorie;

import org.sid.can_db_handler_service.Entities.Categorie.Categorie_member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Categorie_memberRepository extends JpaRepository<Categorie_member,Integer> {
}
