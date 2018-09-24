package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Address;

/**
 * <h1>AddressController Class</h1>
 * The AddressController class is the controller of {@link Address Address.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(AddressController.BASE_URL)
public class AddressController extends BaseRestController<Address, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/address";
}
