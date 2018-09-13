package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Media;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>MediaCrudRepository interface</h1>
 * Database access for the class {@link Media Media.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface MediaCrudRepository extends IBaseRepository<Media, Long> {

}
