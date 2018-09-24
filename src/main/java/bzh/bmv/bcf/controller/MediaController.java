package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Media;

/**
 * <h1>MediaController Class</h1>
 * The MediaController class is the controller of {@link Media Media.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(MediaController.BASE_URL)
public class MediaController extends BaseRestController<Media, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/media";
}
