package interviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;

public class CheckedExceptionsVsUnCheckedExceptions {
	
	public static void main(String[] args) throws IOException {
		
		 CheckedExceptionsVsUnCheckedExceptions c = new CheckedExceptionsVsUnCheckedExceptions();
		// Checked Exceptions are to be surrounded with Try catch before even execution
		// starts, Java Force programmer to handle.it is precaution to programmer to handle when resource/object not
		// available Ex: FileNotFoundException,I/O exception
		//Can be handled by using throws declaration or try/catch block
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\haric\\Desktop\\Chiranjeevi Resume.pdf");
		} catch (FileNotFoundException e) {
			System.out.println("File path not exist");
			e.printStackTrace();
		}
		Object object = fis.read();
		System.out.println(object.toString());
		System.out.println();
		
		// UnCecked Exceptions are to be handled by programmer by using throwable or by
		// surrounding by try/catch. JVm doesn't force user to handle this
		// NPE, Arithmetic exception etc..
		//int x= 10/0; // we know it will throw NPE, but still compiler not forcing programmer to handle 
		//handling unchecked exceptions with try/catch as below
		
		try {
			int x = 10/0;
		}
		catch (ArithmeticException ae) {
			System.out.println("Caught actual exception and actual value is 0/10 "+0/10);
			return ;
		}
		catch(Exception E) {
			System.out.println("Please check the divided by zero exception");
		}
		finally {
			System.out.println("it will execute always");
			c.exception();
			
		}
		
		
	}
	
	public int exception() {
		
		
		try {
			System.out.println("Test");
			System.exit(0);
			int x = 10/0;
		}
		catch (ArithmeticException ae) {
			System.out.println("Caught actual exception and actual value is 0/10 "+0/10);
			System.exit(0);
			return 0;
		}
		catch(Exception E) {
			System.out.println("Please check the divided by zero exception");
		}
		finally {
			System.out.println("it will execute always");
		}
		
		return 1;
		
	}

}
