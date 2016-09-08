package se.cristian.exception;

public class OrderException extends Exception 
{
	private static final long serialVersionUID = 1605799410527238482L;

	public OrderException(String message)
	{
		super(message);
}
}
