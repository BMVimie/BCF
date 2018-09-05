package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.Project;
@RestController
@RequestMapping(ProjectController.BASE_URL)
public class ProjectController extends BaseRestController<Project, Long>{
	public static final String BASE_URL = "/project";
}
