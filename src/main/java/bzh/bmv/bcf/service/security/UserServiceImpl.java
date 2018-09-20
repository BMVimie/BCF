package bzh.bmv.bcf.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bzh.bmv.bcf.model.User;
import bzh.bmv.bcf.model.security.SecurityRole;
import bzh.bmv.bcf.repository.security.SecurityRoleCrudRepository;
import bzh.bmv.bcf.repository.UserCrudRepository;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserCrudRepository userRepository;
    @Autowired
    private SecurityRoleCrudRepository roleRepository;

    public void save(User user) {
        user.setSecurityUserPassword(user.getSecurityUserPassword());
        user.setSecurityUserRoles((Set<SecurityRole>) roleRepository.findAll());
        userRepository.save(user);
    }

    public User findByLogin(String login) {
        return userRepository.findBySecurityUserLogin(login);
    }

}
