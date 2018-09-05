package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ProjectStep;

@RestController
@RequestMapping(ProjectStepController.BASE_URL)
public class ProjectStepController extends BaseRestController<ProjectStep, Long>{
	public static final String BASE_URL = "/projectStep";
}
