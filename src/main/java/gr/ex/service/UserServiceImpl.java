package gr.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.ex.domain.User;
import gr.ex.repository.AbstractRepository;
import gr.ex.repository.UserRepository;
import gr.ex.service.transform.TransformationService;
import gr.ex.service.transform.UserTransformationService;
import gr.ex.transport.UserDto;

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
