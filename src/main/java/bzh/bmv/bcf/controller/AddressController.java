package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Address;

@RestController
@RequestMapping(AddressController.BASE_URL)
public class AddressController extends BaseRestController<Address, Long> {
	public static final String BASE_URL = "/address";
}
