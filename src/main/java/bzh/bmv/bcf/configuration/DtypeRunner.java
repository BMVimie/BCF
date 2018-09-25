package bzh.bmv.bcf.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bzh.bmv.bcf.model.Article;
import bzh.bmv.bcf.model.Footer;
import bzh.bmv.bcf.model.Header;
import bzh.bmv.bcf.repository.ArticleCrudRepository;
import bzh.bmv.bcf.repository.FooterCrudRepository;
import bzh.bmv.bcf.repository.HeaderCrudRepository;

@Component
public class DtypeRunner implements CommandLineRunner {

	@Autowired
	private FooterCrudRepository fcr;

	@Autowired
	private HeaderCrudRepository hcr;

	@Autowired
	private ArticleCrudRepository acr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		String footerName = "ceci est mon footer";
		Footer monFooter = new Footer(footerName);
		// Footer monFooter = new Footer();
		monFooter = fcr.save(monFooter);

		String headerName = "ceci est mon header";
		Header monHeader = new Header(headerName);
		monHeader = hcr.save(monHeader);

		String articleName = "ceci est mon article";
		Article monArticle = new Article(articleName);
		monArticle = acr.save(monArticle);

	}

}
