package gr.examples.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.core.repository.UserRepository;
import gr.examples.domain.User;

@Service
public class UserServiceImpl extends AbstractServiceImpl<User, Long> implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override public AbstractRepository<User, Long> getRepository() {
		return userRepository;
	}
}
