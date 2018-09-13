package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Image;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ImageCrudRepository interface</h1>
 * Database access for the class {@link Image Image.class}.
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface ImageCrudRepository extends IBaseRepository<Image, Long> {

}
