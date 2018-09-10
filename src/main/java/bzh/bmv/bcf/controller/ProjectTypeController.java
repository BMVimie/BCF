package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.ProjectType;
@RestController
@RequestMapping(ProjectTypeController.BASE_URL)
public class ProjectTypeController  extends BaseRestController<ProjectType, Long>{
	public static final String BASE_URL = "/projectType";
}
