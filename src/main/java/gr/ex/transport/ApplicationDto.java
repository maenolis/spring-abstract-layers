package gr.ex.transport;

public class ApplicationDto {

	private Long id;

	private String name;

	private String type;

	public ApplicationDto() {
		type = "dto";
	}

	public ApplicationDto(final Long id, final String name) {
		this.id = id;
		this.name = name;
		type = "dto";
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("ApplicationDto{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", type='").append(type).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
