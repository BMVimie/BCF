package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Project;

/**
 * <h1>ProjectController Class</h1>
 * The ProjectController class is the controller of {@link Project Project.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(ProjectController.BASE_URL)
public class ProjectController extends BaseRestController<Project, Long> {
	/**
	 * path to access this controller.
	 */
	public static final String BASE_URL = "/project";
}
