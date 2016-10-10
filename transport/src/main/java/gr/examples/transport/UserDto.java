package gr.examples.transport;

public class UserDto {

	private Long id;

	private String type;

	public UserDto() {
		type = "dto";
	}

	public UserDto(Long id) {
		this.id = id;
		type = "dto";
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("UserDto{");
		sb.append("id=").append(id);
		sb.append(", type='").append(type).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
