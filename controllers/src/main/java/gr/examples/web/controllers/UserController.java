package gr.examples.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.examples.core.service.AbstractService;
import gr.examples.core.service.UserService;
import gr.examples.domain.User;
import gr.examples.transformation.service.TransformationService;
import gr.examples.transformation.service.UserTransformationService;
import gr.examples.transport.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractRestController<User, UserDto, Long> {

	@Autowired
	UserService userService;

	@Autowired
	UserTransformationService userTransformationService;

	@Override protected AbstractService<User, Long> getService() {
		return userService;
	}

	@Override protected TransformationService<User, UserDto> getTransformationService() {
		return userTransformationService;
	}
}
