package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.CounterpartType;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>CounterpartTypeCrudRepository interface</h1>
 * Database access for the class {@link CounterpartType CounterpartType.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface CounterpartTypeCrudRepository extends IBaseRepository<CounterpartType, Long> {

}
