package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.CounterPart;

@RestController
@RequestMapping(CounterPartController.BASE_URL)
public class CounterPartController extends BaseRestController<CounterPart, Long>{
	public static final String BASE_URL = "/counterPart";
}
