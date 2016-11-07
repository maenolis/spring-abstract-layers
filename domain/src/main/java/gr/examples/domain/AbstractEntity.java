package gr.examples.domain;

public class AbstractEntity<T> {
	protected T id;

	public T getId() {
		return id;
	}

	public void setId(final T id) {
		this.id = id;
	}
}
