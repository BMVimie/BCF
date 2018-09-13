package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.User;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>UserCrudRepository interface</h1>
 * Database access for the class {@link User User.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface UserCrudRepository extends IBaseRepository<User, Long> {
	User findByLogin(String login);
}
