import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double cost = 5.00; // cost of your product
        double tip = 1.7; // your tip
        double total = amount * cost * tip;
        if (amount >= 2) {
            System.out.println(total / 10 * 2 - total); // pretty sure the 2 means how much is off in this case 2 == 20& and so on
        } else {
            System.out.println(total);
        }
    }
}

// this is user input if you couldn't tell by the 3 lines of code dedicated for the user input 
