package java.com.epam.keikom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.com.epam.keikom.dao.RoleDao;
import java.com.epam.keikom.dao.UserDao;
import java.com.epam.keikom.model.User;

@Service
public class ServiceUserImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {

    }

    @Override
    public User findUserByName(String username) {
        return null;
    }
}
