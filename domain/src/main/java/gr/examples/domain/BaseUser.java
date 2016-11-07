package gr.examples.domain;

public abstract class BaseUser<T> extends AbstractEntity<T> {

	private String firstName;
	private String lastName;

	public BaseUser(final T id, final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public BaseUser(final T id) {
		this.id = id;
	}

	public BaseUser() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("BaseUser{");
		sb.append("id=").append(id);
		sb.append('}');
		return sb.toString();
	}
}
