package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ImprovAdvice;

/**
 * <h1>ImprovAdviceController Class</h1>
 * The ImprovAdviceController class is the controller of {@link ImprovAdvice ImprovAdvice.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ImprovAdviceController.BASE_URL)
public class ImprovAdviceController extends BaseRestController<ImprovAdvice, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/improvAdvice";
}
