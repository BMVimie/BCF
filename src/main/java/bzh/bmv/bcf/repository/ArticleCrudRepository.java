package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Article;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * 
 * @author REVEREAU, DUPITIER
 *
 */
@Repository
public interface ArticleCrudRepository extends IBaseRepository<Article, Long> {

}
