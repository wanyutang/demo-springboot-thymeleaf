package io.bootify.app.repos;

import io.bootify.app.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
