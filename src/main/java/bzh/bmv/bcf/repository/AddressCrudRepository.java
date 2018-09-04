package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Address;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface AddressCrudRepository extends IBaseRepository<Address, Long> {

}
