package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Article;

/**
 * <h1>ArticleController Class</h1>
 * The ArticleController class is the controller of {@link Article Article.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author DUPITIER
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ArticleController.BASE_URL)
public class ArticleController extends BaseRestController<Article, Long> {
	/**
	 * path to access this controller
	 */
	public static final String BASE_URL = "/article";
}
