package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.CreditCard;

@RestController
@RequestMapping(CreditCardController.BASE_URL)
public class CreditCardController extends BaseRestController<CreditCard, Long>{
	public static final String BASE_URL = "/creditCard";
}
