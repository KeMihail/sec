package java.com.epam.keikom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.com.epam.keikom.model.User;

public interface UserDao extends JpaRepository<User,Long> {

    User findUserByName(final String userName);

}
