package org.thibaut.exception;

public class ContactNotFoundException extends RuntimeException{
	/**
	 * Constructs a new runtime exception with {@code null} as its
	 * detail message.  The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public ContactNotFoundException( Long id ) {
		super("Le contact dont l'id est [" + id + "] n'a pas été trouvé");
	}
}
