import java.util.Scanner;

public class CarlysEventPrice {
      
      public static final int PRICE_PER_GUEST = 35;
      
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
      
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t***************************************");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t* Carly's makes the food that makes   *");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*              it a party.            *");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t***************************************");
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter the number of guests: ");
            int guest = scanner.nextInt();
            
            int totalPrice = guest * PRICE_PER_GUEST;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThe inputted number of guests are: "+ guest);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThe price per guest is: $" + PRICE_PER_GUEST);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThe total price for "+ guest + " guests is: $" + totalPrice);
            
            if(guest >= 50){
               System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIs it considered a large event? True");
            }
            else{
               System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIs it considered a large event? False");
            }
            scanner.close();
                  
      }
}