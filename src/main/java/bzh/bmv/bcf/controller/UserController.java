package bzh.bmv.bcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bzh.bmv.bcf.controller.base.BaseRestController;
import bzh.bmv.bcf.model.User;

/**
 * <h1>UserController Class</h1>
 * The UserController class is the controller of {@link User User.class}.
 * It allows to recover a JSON at the url BASE_URL.
 * @author REVEREAU
 * @since 11-09-2018
 */
@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController extends BaseRestController<User, Long> {
	/**
	 * path to access this controller.
	 */
	public static final String BASE_URL = "/user";
}
