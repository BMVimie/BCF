package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ProjectStep;

/**
 * <h1>ProjectStepController Class</h1>
 * The ProjectStepController class is the controller of {@link ProjectStep ProjectStep.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ProjectStepController.BASE_URL)
public class ProjectStepController extends BaseRestController<ProjectStep, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/projectStep";
}
