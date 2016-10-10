package gr.examples.core.service.transform;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import gr.examples.domain.User;
import gr.examples.transport.UserDto;

@Service
public class UserTransformationServiceImpl implements UserTransformationService {
	@Override public User transformToEntity(final UserDto entity) {
		return new User(entity.getId());
	}

	@Override public List<User> transformToEntity(final List<UserDto> entities) {
		return entities.stream().map(userDto -> transformToEntity(userDto)).collect(Collectors.toList());
	}

	@Override public UserDto transformToDto(final User entity) {
		return new UserDto(entity.getId());
	}

	@Override public List<UserDto> transformToDto(final List<User> entities) {
		return entities.stream().map(user -> transformToDto(user)).collect(Collectors.toList());
	}
}
