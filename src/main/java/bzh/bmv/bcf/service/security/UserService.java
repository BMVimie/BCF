package bzh.bmv.bcf.service.security;

import bzh.bmv.bcf.model.User;

public interface UserService {
    void save(User user);

    User findByLogin(String login);
}
