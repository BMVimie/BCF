package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Image;

/**
 * <h1>ImageController Class</h1>
 * The ImageController class is the controller of {@link Image Image.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ImageController.BASE_URL)
public class ImageController extends BaseRestController<Image, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/image";
}
