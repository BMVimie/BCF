package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Contribution;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ContributionCrudRepository interface</h1>
 * Database access for the class {@link Contribution Contribution.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ContributionCrudRepository extends IBaseRepository<Contribution, Long> {

}
