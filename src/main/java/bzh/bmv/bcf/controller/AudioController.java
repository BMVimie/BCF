package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Audio;

/**
 * <h1>AudioController Class</h1>
 * The AudioController class is the controller of {@link Audio Audio.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(AudioController.BASE_URL)
public class AudioController extends BaseRestController<Audio, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/audio";
}
