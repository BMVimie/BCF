package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Counterpart;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>CounterpartCrudRepository interface</h1>
 * Database access for the class {@link Counterpart Counterpart.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface CounterpartCrudRepository extends IBaseRepository<Counterpart, Long> {

}
