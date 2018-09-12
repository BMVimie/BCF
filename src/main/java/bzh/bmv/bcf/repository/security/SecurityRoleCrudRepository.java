package bzh.bmv.bcf.repository.security;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.security.SecurityRole;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface SecurityRoleCrudRepository extends  IBaseRepository<SecurityRole, Long> {

}
