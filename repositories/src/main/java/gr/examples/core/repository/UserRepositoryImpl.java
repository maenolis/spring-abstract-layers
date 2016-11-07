package gr.examples.core.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import gr.examples.domain.User;

@Repository
public class UserRepositoryImpl extends AbstractRepositoryImpl<User, Long> implements UserRepository {

	List<User> USERS = Arrays.asList(new User[]{new User(0L, "email0"), new User(1L, "email1"), new User(2L, "email2"), new User(3L, "email3")});

	@Override protected List<User> getObjects() {
		return USERS;
	}
}
