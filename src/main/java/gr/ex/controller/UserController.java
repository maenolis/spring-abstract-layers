package gr.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.ex.domain.User;
import gr.ex.service.AbstractService;
import gr.ex.service.UserService;
import gr.ex.transport.UserDto;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractRestController<User, UserDto, Long> {

	@Autowired
	UserService userService;

	@Override protected AbstractService<User, UserDto, Long> getService() {
		return userService;
	}
}
