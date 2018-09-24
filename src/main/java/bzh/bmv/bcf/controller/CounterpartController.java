package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Counterpart;

/**
 * <h1>CounterpartController Class</h1>
 * The CounterpartController class is the controller of {@link Counterpart Counterpart.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(CounterpartController.BASE_URL)
public class CounterpartController extends BaseRestController<Counterpart, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/counterpart";
}
