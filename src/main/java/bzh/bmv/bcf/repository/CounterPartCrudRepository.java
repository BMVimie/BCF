package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.CounterPart;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface CounterPartCrudRepository extends IBaseRepository<CounterPart, Long>{

}
