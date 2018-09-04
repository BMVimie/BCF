package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.User;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController extends BaseRestController<User, Long> {
	public static final String BASE_URL = "/user";
}
