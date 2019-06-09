package java.com.epam.keikom.service;

import java.com.epam.keikom.model.User;

public interface UserService {
    void save(final User user);

    User findUserByName(final String username);
}
