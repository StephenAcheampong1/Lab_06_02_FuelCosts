import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        String trash = "";

        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0.00;

        Scanner in = new Scanner(System.in);
        System.out.println("What is the number of gallons of gas in your tank?");
        gallons = in.nextDouble();

        System.out.print("Enter your fuel efficiency in MPG: ");
        if(in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for MPG" +trash);
        }

        System.out.print("What is the price of gas in dollars: ");
        if (in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a number for price of a gallon " +trash);
        }

        System.out.println("The price of gas is $" + pricePerGallon + " per gallon, therefore the cost per 100 miles will cost you $" + (pricePerGallon * 100 / mpg));
        System.out.println("The car can travel " +(gallons * mpg) + " miles with the gas in the tank");
    }
}