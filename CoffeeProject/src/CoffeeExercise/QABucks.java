package CoffeeExercise;

import java.util.ArrayList;

public class QABucks {
	
	public static void main (String[] args)
	{
		ArrayList<String> OrdersArray = new ArrayList <>();
		ArrayList<String> DoneOrdersArray = new ArrayList <>();
		
		//Add a new order to the orders array
		
		OrdersArray.add("Small Espresso w/ Chocolate");
		OrdersArray.add("Large Cold Brew w/ double shot");
		OrdersArray.add("Medium Cappucino w/ Oat Milk");
		OrdersArray.add("Medium Flat White");
		OrdersArray.add("Large Choc Cookie Frappe w/ sugar free syrup");
		OrdersArray.add("Small Caramel Iced Latte w/ honeycomb dust");
		OrdersArray.add("Small Americano");
		OrdersArray.add("Large Cafe Au Lait w/ extra milk");
		OrdersArray.add("Medium Strawberry Iced Tea");
		
		System.out.println(OrdersArray);
		
		System.out.println("*********************************************************");
		
		//- Return the name of the order
		
		System.out.println(OrdersArray.get(2));
		System.out.println(OrdersArray.get(7));
		
		System.out.println("*********************************************************");
		
		//- Modify the order (passing in a string)
		
		OrdersArray.set(0, "Large Espresso, no chocolate");
		System.out.println(OrdersArray.get(0));
		OrdersArray.set(3, "Small Flat white");
		System.out.println(OrdersArray);
		
		System.out.println("*********************************************************");
		
		//- Remove the order from the orders array
		System.out.println(OrdersArray);
		OrdersArray.remove(0); 
		OrdersArray.remove(1);
		OrdersArray.remove(2);
		OrdersArray.remove(3);
		System.out.println(OrdersArray);
		
		System.out.println("*********************************************************");
		
		//-Add the order to the doneOrders array
		DoneOrdersArray.add("Small Espresso w/ Chocolate");
		DoneOrdersArray.add("Large Cold Brew w/ double shot");
		DoneOrdersArray.add("Medium Cappucino w/ Oat Milk");
		DoneOrdersArray.add("Medium Flat White");
		System.out.println(DoneOrdersArray);
		
		System.out.println("*********************************************************");
		
		//- Prints out the length of the orders and doneOrders array
		System.out.println(OrdersArray.size());
		System.out.println(DoneOrdersArray.size());
		System.out.println("*********************************************************");
		
		//- clears either or both of the arrays
		OrdersArray.clear();
		System.out.println(OrdersArray);
		System.out.println(DoneOrdersArray);
		
	}

}
