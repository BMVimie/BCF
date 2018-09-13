package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.CreditCard;


/**
 * <h1>CreditCardController Class</h1>
 * The CreditCardController class is the controller of {@link CreditCard CreditCard.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author DUPITIER
 * @since 11-09-2018
 */
@RestController
@RequestMapping(CreditCardController.BASE_URL)
public class CreditCardController extends BaseRestController<CreditCard, Long> {
	/**
	 * path to access this controller.
	 */
	public static final String BASE_URL = "/creditCard";
}
