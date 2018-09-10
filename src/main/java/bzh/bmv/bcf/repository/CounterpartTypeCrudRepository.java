package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.CounterpartType;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface CounterpartTypeCrudRepository extends IBaseRepository<CounterpartType, Long>{

}
