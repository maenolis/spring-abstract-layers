package gr.examples.core.service;

import gr.examples.domain.User;
import gr.examples.transport.UserDto;

public interface UserService extends AbstractService<User, UserDto, Long> {
}
