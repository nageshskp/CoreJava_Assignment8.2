// Declare class which extends Thread class
class ClassThread extends Thread {

	// Inheriting run method in thread class
	
	public void run() {

		System.out.println("Using Thread class");
		//prints Checking in thread class
		
		//thread to check prime number
		
		try {

			//check number is prime or not
			
			if (CheckPrimeNumber.input > 1 && CheckPrimeNumber.input % 2 != 0) {

				System.out.println("Given Number is  prime");
				
				//prints Number is  prime

			} else {

				System.out.println("Number is not Prime.");
				
				//prints Number is not Prime.

			}

		} catch (Exception ex) {

		}

	}

}