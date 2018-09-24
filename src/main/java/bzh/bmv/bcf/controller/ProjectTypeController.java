package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ProjectType;

/**
 * <h1>ProjectTypeController Class</h1>
 * The ProjectTypeController class is the controller of {@link ProjectType ProjectType.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ProjectTypeController.BASE_URL)
public class ProjectTypeController extends BaseRestController<ProjectType, Long> {
    /**
     * path to access this controller.
     */
    public static final String BASE_URL = "/projectType";
}
