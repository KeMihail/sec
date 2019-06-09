package java.com.epam.keikom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.com.epam.keikom.model.Role;

public interface RoleDao extends JpaRepository<Role,Long> {
}
