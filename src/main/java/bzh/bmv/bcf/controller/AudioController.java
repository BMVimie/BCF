package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Audio;

@RestController
@RequestMapping(AudioController.BASE_URL)
public class AudioController extends BaseRestController<Audio, Long>{
	public static final String BASE_URL = "/audio";
}
