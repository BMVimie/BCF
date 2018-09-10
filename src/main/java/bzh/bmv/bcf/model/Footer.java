package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.FooterContract;


/**
 * <h1>Footer class</h1>
 * The class Footer implements one footer.
 * A footer is a child of the class Article.
 * @author REVEREAU, DUPITIER
 * @since 2018-09-10
 */
@Entity
@Table(name = FooterContract.TABLENAME)
public class Footer extends Article {
	

}
