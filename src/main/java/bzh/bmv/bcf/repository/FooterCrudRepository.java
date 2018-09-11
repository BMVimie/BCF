package bzh.bmv.bcf.repository;

import org.springframework.stereotype.Repository;
import bzh.bmv.bcf.model.Footer;
import bzh.bmv.bcf.repository.base.IBaseRepository;

/**
 * <h1>FooterCrudRepository interface</h1>
 * Database access for the class {@link Footer Footer.class}
 * @author REVEREAU
 * @since 11-09-2018
 */
@Repository
public interface FooterCrudRepository extends IBaseRepository<Footer, Long>{

}
