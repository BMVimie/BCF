package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Counterpart;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface CounterpartCrudRepository extends IBaseRepository<Counterpart, Long>{

}
