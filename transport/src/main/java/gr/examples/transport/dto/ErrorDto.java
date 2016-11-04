package gr.examples.transport.dto;

import gr.examples.transport.ErrorMessageProvider;
import gr.examples.transport.enumeration.RestError;

public class ErrorDto {
	private ErrorMessageProvider provider = RestError.GENERIC_ERROR;
	private String message = "No message provided.";

	public ErrorDto(final ErrorMessageProvider provider, final String message) {
		this.provider = provider;
		this.message = message;
	}

	public ErrorDto(final ErrorMessageProvider provider) {
		this.provider = provider;
	}

	public ErrorDto(final String message) {
		this.message = message;
	}

	public ErrorDto() {
	}

	public ErrorMessageProvider getProvider() {
		return provider;
	}

	public String getMessage() {
		return message;
	}
}
