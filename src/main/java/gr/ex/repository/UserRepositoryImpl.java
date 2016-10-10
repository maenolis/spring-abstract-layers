package gr.ex.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import gr.ex.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	List<User> USERS = Arrays.asList(new User[]{new User(0L), new User(1L), new User(2L), new User(3L)});

	@Override public List<User> get() {
		return USERS;
	}

	@Override public User get(final Long id) {
		Stream<User> userStream = USERS.stream().filter(user -> id.equals(user.getId()));
		return userStream.findFirst().get();
	}

	@Override public User create(final User entity) {
		return null;
	}

	@Override public User update(final User entity) {
		return null;
	}

	@Override public void delete(final User entity) {

	}
}
