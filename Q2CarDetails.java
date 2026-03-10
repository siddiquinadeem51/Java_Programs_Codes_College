import java.util.Scanner;

public class Q2CarDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Car Name: ");
        String carName = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();

        // Displaying output
        System.out.println("\nCar Details");
        System.out.println("Car Name: " + carName);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);

        sc.close();
    }
}