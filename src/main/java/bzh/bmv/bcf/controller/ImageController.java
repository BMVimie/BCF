package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Image;

@RestController
@RequestMapping(ImageController.BASE_URL)
public class ImageController extends BaseRestController<Image, Long>{
	public static final String BASE_URL = "/image";
}
