package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Header;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>HeaderCrudRepository interface</h1>
 * Database access for the class {@link Header Header.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface HeaderCrudRepository extends IBaseRepository<Header, Long> {

}
