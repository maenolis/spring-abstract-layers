package gr.examples.transport.enumeration;

import gr.examples.transport.ErrorMessageProvider;

public enum RestError implements ErrorMessageProvider {
	GENERIC_ERROR(0L, "GENERIC_ERROR"),
	NOT_FOUND(1L, "NOT_FOUND"),
	VALIDATION_ERROR(1L, "VALIDATION_ERROR");

	RestError(final Long id, final String message) {
		this.id = id;
		this.message = message;
	}

	private Long id;
	private String message;

	@Override public Long getId() {
		return id;
	}

	@Override public String getMessage() {
		return message;
	}
}
