package gr.examples.transport.dto;

public class AbstractDto<T> {

	protected T id;

	private String type = "dto";

	public AbstractDto(final T id) {
		this.id = id;
	}

	public AbstractDto() {
	}

	public T getId() {
		return id;
	}

	public void setId(final T id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("AbstractDto{");
		sb.append("id=").append(id);
		sb.append(", type='").append(type).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
