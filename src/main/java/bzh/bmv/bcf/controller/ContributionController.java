package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Contribution;

/**
 * <h1>ContributionController Class</h1>
 * The ContributionController class is the controller of {@link Contribution Contribution.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ContributionController.BASE_URL)
public class ContributionController extends BaseRestController<Contribution, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/contribution";
}
