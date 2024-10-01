package com.systex.lottery.exception;

@SuppressWarnings("serial")
public class InputParameterException extends Exception{
	
	/**
	 * Used to setting develop or user environment.
	 */
	private static boolean isDev = true; 	

	/**
	 * Only custom message.
	 * @param customErrorMsg The customize error massage to user.
	 */
	public InputParameterException(String customizeErrorMsg) {
		this(customizeErrorMsg, null);		
	}
	
	/**
	 * Throw exception with custom message and system error message in develop environment.
	 * Or throw custom message only.
	 * @param customErrorMsg The customize error massage to user.
	 * @param e The system error message.
	 */
	public InputParameterException(String customizeErrorMsg, Exception e) {
		super(isDev ? (customizeErrorMsg + "system error msg : " + e) : customizeErrorMsg);
	}
	
	/**
	 * Return just the message part
	 */
    @Override
    public String toString() {
        
        return getMessage();
    }	
}
