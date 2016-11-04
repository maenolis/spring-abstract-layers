package gr.examples.transport.dto;

import javax.validation.constraints.Size;

public class UserDto extends AbstractDto<Long> {

	@Size(min = 10, message = "10 or more.")
	private String email;

	public UserDto() {
	}

	public UserDto(Long id) {
		super(id);
	}

	public UserDto(final Long id, final String email) {
		super(id);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("UserDto{");
		sb.append('}');
		return sb.toString();
	}
}
