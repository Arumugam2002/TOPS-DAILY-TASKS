/*   1. small (150)4->500ml coke free
2. medium (250)3->11t coke
3.large (500) ->2 1lt ice cream
4. monster (700)5-> all (1.5 liter +ice)

*/

import java.util.Scanner;



public class PizzaMenu {

	public static void main(String[] args)
	{
		
		System.out.println("\nEnter your choice:-  \n1. Small Pizza \n2. Medium Pizza \n3.Large Pizza \n4.Monster Pizza\n5. Show Total Price");
		Scanner n = new Scanner(System.in);
		
		int smallPizza = 150;
		int mediumPizza = 250;
		int largePizza = 500;
		int monsterPizza = 700;
		
		
		
		int smallPizzaSelected = 0;
		int mediumPizzaSelected = 0;
		int largePizzaSelected = 0;
		int monsterPizzaSelected = 0;
		
		int totalPrice = 0;
		
		while(true)
		{
			
			
			int choice = n.nextInt();
			
			
			
			switch(choice)
			{
			case 1: 
				
				smallPizzaSelected++;
				
				
				
				if(smallPizzaSelected % 4 == 0)
				{
					
					System.out.println("You got 500ml coke free as you have selected 4 small pizzas");
				}
				
				totalPrice += smallPizza;
				
				System.out.println("You selected "+ smallPizzaSelected +  " Small Pizza");
				break;
				
			case 2: 
				
				mediumPizzaSelected++;
				
				if(mediumPizzaSelected % 3 == 0)
				{
					
					System.out.println("You got 1ltr coke free as you have selected 3 medium pizzas\n");
				}
				
				totalPrice += mediumPizza;
				
				System.out.println("You selected " + mediumPizzaSelected +  " Medium Pizza");
				break;
				
			case 3:
				
				largePizzaSelected++;
				
				if(largePizzaSelected % 2 == 0 )
				{
					System.out.println("You got ice cream free as you selected 2 Large Pizzas\n");
				}
				
				totalPrice += largePizza;
				System.out.println("You selected " + largePizzaSelected + " Large Pizza");
				break;
				
			case 4:
				
				monsterPizzaSelected++;
				
				if(monsterPizzaSelected % 5 == 0)
				{
					System.out.println("You get all the coke listed above and plus ice cream as you have selected 5 Monster Pizza\n");
				}
				
				totalPrice += monsterPizza;
				
				System.out.println("You selected " + monsterPizzaSelected +" Monster Pizza");
				break;
				
			case 5: 
				
				System.out.println("Total Price is " + totalPrice);
				
				
				break;
				
			default:
				
				System.out.println("\nInvalid Choice Choose choice from 1 to 5.");
				
				
			}
		}
		
		
		
		
		
		
		
			
	}
	
	
	
}
