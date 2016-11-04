package gr.examples.transformation.service;

import gr.examples.domain.User;
import gr.examples.transport.dto.UserDto;

public interface UserTransformationService extends TransformationService<User, UserDto> {
}
