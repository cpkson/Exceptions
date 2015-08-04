package uk.co.parknet.exception;

/**
 * Processing Exceptions
 * 
 * @author craigp
 * @since 27/2/2015
 * @version 0.1
 */
public class ProcessingException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4354187063995251541L;

	/**
	 * 
	 * @param message
	 */
	public ProcessingException(String message)
	{
		super(message);
	}
	
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public ProcessingException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
	
	/**
	 * 
	 * @param throwable
	 */
	public ProcessingException(Throwable throwable)
	{
		super(throwable);
	}
}