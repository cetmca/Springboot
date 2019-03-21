package com.example.demo;

public class MyDataException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5265506320725186270L;

	public MyDataException(String message) {
        super(message);
        System.out.println("999999999999999999999999999999");
    }
	
	public MyDataException() {
		//System.out.println("999999999999999999999999999999");
       super();
    }
    

}
