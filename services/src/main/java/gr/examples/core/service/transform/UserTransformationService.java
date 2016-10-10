package gr.examples.core.service.transform;

import gr.examples.domain.User;
import gr.examples.transport.UserDto;

public interface UserTransformationService extends TransformationService<User, UserDto> {
}
