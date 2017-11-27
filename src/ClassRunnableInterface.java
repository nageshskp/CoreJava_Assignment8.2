//Declare Class implements runnable interface
public class ClassRunnableInterface implements Runnable {

		// overriding run method implementing Runnable interface
		
		@Override
		public void run() {
				
			System.out.println("Using Runnable interface");
			//Prints Checking in Runnable interface
			
			try {

				//check number is prime or not
				
				if (CheckPrimeNumber.input > 1 && CheckPrimeNumber.input % 2 != 0) {

					System.out.println("Given Number is  prime");
					//prints Number is  prime

				} else {

					System.out.println("Given Number is not Prime.");
					//prints Number is not Prime.

				}
				// Catching Exception	
			} catch (Exception ex) {

			}

		}

	}