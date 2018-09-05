package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ImprovAdvice;

@RestController
@RequestMapping(ImprovAdviceController.BASE_URL)
public class ImprovAdviceController extends BaseRestController<ImprovAdvice, Long>{
	public static final String BASE_URL = "/improvAdvice";
}
