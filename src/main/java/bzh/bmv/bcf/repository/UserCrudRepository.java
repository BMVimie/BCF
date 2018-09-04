package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.User;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface UserCrudRepository extends IBaseRepository<User, Long> {

}
