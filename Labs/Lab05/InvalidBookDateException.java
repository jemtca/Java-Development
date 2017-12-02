package ca.ciccc.java.model;

public class InvalidBookDateException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidBookDateException() {

	}

	public InvalidBookDateException(String message) {

		super(message);

	}

	public InvalidBookDateException(Throwable cause) {

		super(cause);

	}

	public InvalidBookDateException(String message, Throwable cause) {

		super(message, cause);

	}

	public InvalidBookDateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {

		super(message, cause, enableSuppression, writableStackTrace);

	}

}
