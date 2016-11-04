package gr.examples.domain;

import javax.validation.constraints.Min;

public abstract class BaseUser<T> {

	@Min(value = 0, message = "No negative ids allowed.")
	protected T id;

	public BaseUser(final T id) {
		this.id = id;
	}

	public BaseUser() {
	}

	public T getId() {
		return id;
	}

	public void setId(final T id) {
		this.id = id;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("BaseUser{");
		sb.append("id=").append(id);
		sb.append('}');
		return sb.toString();
	}
}
