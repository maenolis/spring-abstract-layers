package gr.examples.domain;

public class User extends BaseUser<Long> {

	private String email;

	public User(final Long id, final String firstName, final String lastName, final String email) {
		super(id, firstName, lastName);
		this.email = email;
	}

	public User() {

	}

	public User(Long id) {
		super(id);
	}

	public User(final Long id, final String email) {
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
		final StringBuilder sb = new StringBuilder("User{");
		sb.append(", email='").append(email).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override public boolean equals(final Object obj) {
		if (obj == null || !(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;

		return other.getId().equals(this.id);
	}
}
