/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.application.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.preregistration.core.common.dto.MainResponseDTO;
import lombok.Getter;

/**
 * The RecordFailedToUpdateException class represents an exception that occurs
 * when a record fails to update.. This class extends
 * {@link BaseUncheckedException} and includes various constructors for
 * different use cases, as well as a {@link MainResponseDTO} object for
 * additional error information.
 * 
 * @author Rajath KR
 * @since 1.0.0
 * 
 */
@Getter
public class RecordFailedToUpdateException extends BaseUncheckedException {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The main response DTO associated with the exception. */
	private MainResponseDTO<?> mainResponseDTO;

	/**
	 * Default constructor
	 */
	public RecordFailedToUpdateException() {
		super();
	}

	/**
	 * Constructs a new {@code RecordFailedToUpdateException} with the specified
	 * error message.
	 * 
	 * @param errorMessage the detailed error message.
	 */
	public RecordFailedToUpdateException(String errorMessage) {
		super("", errorMessage);
	}

	/**
	 * Constructs a new {@code RecordFailedToUpdateException} with the specified
	 * error code and error message.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 */
	public RecordFailedToUpdateException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage, null);
	}

	/**
	 * Constructs a new {@code RecordFailedToUpdateException} with the specified
	 * error code, error message, and response.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 * @param response     the {@link MainResponseDTO} object containing additional
	 *                     information about the error.
	 */
	public RecordFailedToUpdateException(String errorCode, String errorMessage, MainResponseDTO<?> response) {
		super(errorCode, errorMessage, null);
		this.mainResponseDTO = response;
	}

	/**
	 * Constructs a new {@code RecordFailedToUpdateException} with the specified
	 * error message and root cause.
	 * 
	 * @param errorMessage the detailed error message.
	 * @param rootCause    the cause of the error.
	 */
	public RecordFailedToUpdateException(String errorMessage, Throwable rootCause) {
		super("", errorMessage, rootCause);
	}

	/**
	 * Constructs a new {@code RecordFailedToUpdateException} with the specified
	 * error message and root cause.
	 * 
	 * @param errorCode    the error code representing the specific error condition.
	 * @param errorMessage the detailed error message.
	 * @param rootCause    the cause of the error.
	 */
	public RecordFailedToUpdateException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);
	}
}