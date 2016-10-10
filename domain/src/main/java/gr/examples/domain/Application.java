package gr.examples.domain;

public class Application {

	private Long id;

	private String name;

	public Application() {
	}

	public Application(final Long id, final String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Long getId() {

		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("Application{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
