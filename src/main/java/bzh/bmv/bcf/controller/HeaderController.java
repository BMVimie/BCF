package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Header;

/**
 * <h1>HeaderController Class</h1>
 * The HeaderController class is the controller of {@link Header Header.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author DUPITIER
 * @since 11-09-2018
 */
@RestController
@RequestMapping(HeaderController.BASE_URL)
public class HeaderController extends BaseRestController<Header, Long> {
	/**
	 * path to access this controller.
	 */
	public static final String BASE_URL = "/header";
}
