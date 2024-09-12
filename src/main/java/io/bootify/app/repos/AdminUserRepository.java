package io.bootify.app.repos;

import io.bootify.app.domain.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminUserRepository extends JpaRepository<AdminUser, String> {
}
