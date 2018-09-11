package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Footer;

/**
 * <h1>FooterController Class</h1>
 * The FooterController class is the controller of {@link Footer Footer.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(FooterController.BASE_URL)
public class FooterController extends BaseRestController<Footer, Long>{
	/**
	 * path to access this controller
	 */
	public static final String BASE_URL = "/footer";
}
