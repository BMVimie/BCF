package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.CounterpartType;

/**
 * <h1>CounterpartTypeController Class</h1>
 * The CounterpartTypeController class is the controller of {@link CounterpartType CounterpartType.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author DUPITIER
 * @since 11-09-2018
 */
@RestController
@RequestMapping(CounterpartTypeController.BASE_URL)
public class CounterpartTypeController extends BaseRestController<CounterpartType, Long> {
	/**
	 * path to access this controller.
	 */
	public static final String BASE_URL = "/counterpartType";
}
