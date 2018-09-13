package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.CreditCard;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>CreditCardCrudRepository interface</h1>
 * Database access for the class {@link CreditCard CreditCard.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface CreditCardCrudRepository extends IBaseRepository<CreditCard, Long> {

}
