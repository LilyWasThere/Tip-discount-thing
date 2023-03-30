import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        double cost = 5.00; // cost of said product
        double tip = 1.07; // tip (1.07 = 7%)
        double total = amount * cost * tip; 
        double discount = total / 10 * 1 - total; // discount by 10%
        double total2 = Math.abs(discount); // removes neg and makes pos
        if (amount >= 2) { 
            System.out.printf("%.2f", total2);
        } else {
            System.out.printf("%.2f", total);
        }
    }
}

/*system.out.printf is used tell java how many decimal places it should have*/
