package bzh.bmv.bcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bzh.bmv.bcf.model.User;
import bzh.bmv.bcf.repository.UserCrudRepository;

@RestController
@RequestMapping(RegisterController.BASE_URL)
public class RegisterController {

	public static final String BASE_URL = "/register";

	@Autowired
	UserCrudRepository crudRepository;

	@RequestMapping(path = {"/", ""}, method = RequestMethod.POST)
    public ResponseEntity<User> postItem(@RequestBody User item) {
    	crudRepository.save(item);
    	new ResponseEntity<User>(HttpStatus.OK);
		return ResponseEntity.ok(item);
    }
}
