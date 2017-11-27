//Import Java Scanner Class for to take input from User
import java.util.Scanner;
//Declaring Class
public class CheckPrimeNumber{

	//initializing static variable
	
	public static int input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating instance object for scanner
		
		Scanner ScanInput = new Scanner(System.in);

		System.out.println("Enter the number");
		//prints Enter the number

		input = ScanInput.nextInt();
		//initiating user input

		ScanInput.close();
		//closing Scanner object
		
		// creating instance object for MyThread extending Thread class

		Thread t = new ClassThread();

		t.start();
		// starts execution of MyThread
		
		// creating instance object for MyThread1 which implements Runnable interface
	
		Thread t1 = new Thread(new ClassRunnableInterface());
		
		t1.start();
		// starts execution of ClassRunnableInterface

	}

}