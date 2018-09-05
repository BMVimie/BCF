package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;

import bzh.bmv.bcf.model.Image;
import bzh.bmv.bcf.repository.base.IBaseRepository;

@Repository
public interface ImageCrudRepository extends IBaseRepository<Image, Long>{

}
