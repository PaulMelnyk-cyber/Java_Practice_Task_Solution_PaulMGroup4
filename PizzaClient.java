package day_11_Class_and_Object_Part2;

public class PizzaClient {

    public static void main(String[] args) {


        Pizza pizza = new Pizza("small", 3,6);
        System.out.println(pizza);

        Pizza pizza1 = new Pizza("medium",2,5);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("large",5,8);
        System.out.println(pizza2);
    }
}
