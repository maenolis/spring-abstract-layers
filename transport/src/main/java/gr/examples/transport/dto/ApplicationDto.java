package gr.examples.transport.dto;

public class ApplicationDto extends AbstractDto<Long> {

	private String name;

	public ApplicationDto() {

	}

	public ApplicationDto(final Long id, final String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("ApplicationDto{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
