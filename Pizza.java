package day_11_Class_and_Object_Part2;

import java.util.Scanner;

public class Pizza {

    /*
    Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

     */

        public String size;
        public int numberOfToppings ;
        public int numberOfPepperoniTopping;


         public Pizza(String size, int numberOfToppings, int numberOfPepperoniTopping){

                 this.size = size;
                 this.numberOfToppings = numberOfToppings;
                 this.numberOfPepperoniTopping = numberOfPepperoniTopping;

         }



        public double calcCost() {
                double baseCost;
                switch (size.toLowerCase()) {
                        case "small":
                                baseCost = 10;
                                break;
                        case "medium":
                                baseCost = 12;
                                break;
                        case "large":
                                baseCost = 14;
                                break;
                        default:
                                baseCost = 0;
                                break;
                }
                double toppingCost = 2 * (numberOfPepperoniTopping + numberOfToppings);
                return baseCost + toppingCost;
          }

        @Override
        public String toString() {
                return "Pizza{" +
                        "size='" + size + '\'' +
                        ", numberOfToppings=" + numberOfToppings +
                        ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                        ", total cost = " + calcCost() +
                        '}';
        }
}
