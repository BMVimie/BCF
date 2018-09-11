package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Audio;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>AudioCrudRepository interface</h1>
 * Database access for the class {@link Audio Audio.class}
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface AudioCrudRepository extends IBaseRepository<Audio, Long>{

}
