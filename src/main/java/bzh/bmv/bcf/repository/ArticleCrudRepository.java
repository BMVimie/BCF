package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Article;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>ArticleCrudRepository interface</h1>
 * Database access for the class {@link Article Article.class}
 * @author DUPITIER
 * @since 11-09-2018
 */
@Repository
public interface ArticleCrudRepository extends IBaseRepository<Article, Long> {

}
