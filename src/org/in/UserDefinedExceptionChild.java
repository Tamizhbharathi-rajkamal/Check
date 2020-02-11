package org.in;

public class UserDefinedExceptionChild {
	
	public static void main(String[] args) throws userDefinedException,Throwable,ArithmeticException {
		
		int i= 2;
		if(i == 2) {
			throw new userDefinedException();
		}
		
	/*	int i = 2;
		try
		{
			if(i == 2)
			{
				throw new userDefinedException();
			}
		}
			catch(userDefinedException e) {
				//e.printStackTrace();
				System.out.println("hand");
			}
			*/
		
	}
	
}

