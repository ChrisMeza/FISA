package trains.exercise.domain.exception;

public class DestinationAlreadyExistsException extends Exception{

	private static final long serialVersionUID = 5947178725204875764L;

	/**
	 * Error given when destination already exists
	 * @param message
	 */
	public DestinationAlreadyExistsException(String message){
		super(message);
	}
	
}
