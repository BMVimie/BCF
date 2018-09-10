package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Header;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * 
 * @author REVEREAU, DUPITIER
 *
 */
@Repository
public interface HeaderCrudRepository extends IBaseRepository<Header, Long> {

}
