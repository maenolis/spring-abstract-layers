package gr.examples.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.examples.core.service.AbstractService;
import gr.examples.core.service.UserService;
import gr.examples.domain.User;
import gr.examples.transport.UserDto;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractRestController<User, UserDto, Long> {

	@Autowired
	UserService userService;

	@Override protected AbstractService<User, UserDto, Long> getService() {
		return userService;
	}
}
