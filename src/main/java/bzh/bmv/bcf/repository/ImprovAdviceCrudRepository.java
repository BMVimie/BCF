package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.ImprovAdvice;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ImprovAdviceCrudRepository interface</h1>
 * Database access for the class {@link ImprovAdvice ImprovAdvice.class}
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ImprovAdviceCrudRepository extends IBaseRepository<ImprovAdvice, Long>{

}
