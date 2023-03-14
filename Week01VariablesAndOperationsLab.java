package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int openSeats = 9;
		
				
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceryCost = 33.43;
	
				
		// 3. Create a variable to hold a person's middle initial
		char middleInitial= 'M';
			
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside = true;
				
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Sarah";
				
		// 6. Create a variable to hold a street address
		String streetAddress = "100 Main St";

		// 7. Print all variables to the console
		System.out.println("There are " + openSeats + " seats available on the plane.");	
		System.out.println("These groceries cost $" + groceryCost + ".");
		System.out.println("Their middle initial is " + middleInitial + ".");
		System.out.println("It is hot outside - " + hotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println("The address is " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		openSeats = openSeats - 2;
		System.out.println(openSeats);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceryCost = groceryCost + 2.15;
		System.out.println("After adding a candy bar, the cost of groceries are " + groceryCost+".");

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'A';
		System.out.println("The birth certificate was printed incorrectly, the correct middle initial is " + middleInitial+".");

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOutside = false;
		System.out.println("It is hot outside - " + hotOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " +  middleInitial + ". " + "Smith";
		
			

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("The customer's full name is " + fullName + " and they live at " + streetAddress + ".");


	}

}
