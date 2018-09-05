package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Audio;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface AudioCrudRepository extends IBaseRepository<Audio, Long>{

}
