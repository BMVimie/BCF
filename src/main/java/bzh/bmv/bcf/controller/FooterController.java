package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Footer;
@RestController
@RequestMapping(FooterController.BASE_URL)
public class FooterController extends BaseRestController<Footer, Long>{
	public static final String BASE_URL = "/footer";
}
