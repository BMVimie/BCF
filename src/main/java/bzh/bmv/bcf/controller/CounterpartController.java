package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Counterpart;

@RestController
@RequestMapping(CounterpartController.BASE_URL)
public class CounterpartController extends BaseRestController<Counterpart, Long>{
	public static final String BASE_URL = "/counterpart";
}
