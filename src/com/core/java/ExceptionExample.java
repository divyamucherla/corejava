package com.core.java;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	//throws exception(negative scenario)
	//till finally it will execute and after that it will throw exception
	//after finally you are not supossed to have any code and it should follow try,(catch or finally)
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try{
			testException(5);
			testException(10);
//If catch(Exception e) {} is above all the other then it will throw error
			//sub exception should be declared on top of main (Exception) class
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			
		}finally{
			System.out.println("Releasing resources");			
		}
		testException(15);
	}
	
	public static void testException(int i) throws FileNotFoundException, IOException{
		if(i < 0){
			FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
			throw myException;
		}else if(i > 10){
			throw new IOException("Only supported for index 0 to 10");
		}

	}


}
