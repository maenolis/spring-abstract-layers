package gr.examples.core.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import gr.examples.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	List<User> USERS = Arrays.asList(new User[]{new User(0L, "email0"), new User(1L, "email1"), new User(2L, "email2"), new User(3L, "email3")});

	@Override public List<User> get() {
		return USERS;
	}

	@Override public User get(final Long id) {
		Stream<User> userStream = USERS.stream().filter(user -> id.equals(user.getId()));
		return userStream.findFirst().get();
	}

	@Override public User create(final User entity) {
		USERS.add(entity);
		return entity;
	}

	@Override public User update(final User entity) throws Exception {
		if (!USERS.remove(entity)) {
			throw new Exception(String.format("User with id [%d] not found", entity.getId()));
		}
		USERS.add(entity);
		return entity;
	}

	@Override public void delete(final User entity) throws Exception {
		if (!USERS.remove(entity)) {
			throw new Exception(String.format("User with id [%d] not found", entity.getId()));
		}
	}
}
