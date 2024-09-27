import java.util.Scanner;
public class Billing {
      
      final static double TAX_RATE = 0.08;
      public static double computeBill(double price) {
      
            double total = price + (price * TAX_RATE);
            System.out.println("The total price for the bill is: $" +total);
            return total;
      
      }
      public static double computeBill(double price, int quantity) {
      
            double total = (price * quantity) + ((price * quantity) * TAX_RATE);
            System.out.println("The total price for the bill is: $" +total);
            return total;
      
      }
      public static double computeBill(double price, int quantity, int coupon) {
            
            double discount = ((price * quantity) - coupon);
            double total = (discount * TAX_RATE) + discount;
            System.out.println("The total price for the bill is: $" +total);
            return total;
      }

      
      
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int quantity,coupon;
            double price;
            
            System.out.printf("Enter the price: ");
            price = scan.nextDouble();
            System.out.printf("Enter the quantity: ");
            quantity = scan.nextInt();
            System.out.printf("Enter the coupon/discount: ");
            coupon = scan.nextInt();
   
            computeBill(price);
            computeBill(price, quantity);
            computeBill(price, quantity, coupon);
      
      }

}