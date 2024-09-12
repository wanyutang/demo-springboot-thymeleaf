package io.bootify.app.repos;

import io.bootify.app.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<Group, String> {
}
