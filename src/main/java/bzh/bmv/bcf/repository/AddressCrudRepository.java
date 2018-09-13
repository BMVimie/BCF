package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Address;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>AddressCrudRepository interface</h1>
 * Database access for the class {@link Address Address.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface AddressCrudRepository extends IBaseRepository<Address, Long> {

}
