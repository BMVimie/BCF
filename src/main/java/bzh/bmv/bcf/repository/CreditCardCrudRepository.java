package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.CreditCard;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface CreditCardCrudRepository extends IBaseRepository<CreditCard, Long>{

}
