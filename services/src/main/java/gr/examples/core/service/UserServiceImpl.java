package gr.examples.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.core.repository.UserRepository;
import gr.examples.core.service.transform.TransformationService;
import gr.examples.core.service.transform.UserTransformationService;
import gr.examples.domain.User;
import gr.examples.transport.UserDto;

@Service
public class UserServiceImpl extends AbstractServiceImpl<User, UserDto, Long> implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserTransformationService userTransformationService;

	@Override public AbstractRepository<User, Long> getRepository() {
		return userRepository;
	}

	@Override public TransformationService<User, UserDto> getTransformationService() {
		return userTransformationService;
	}
}
