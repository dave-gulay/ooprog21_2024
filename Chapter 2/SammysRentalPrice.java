import java.util.Scanner;

public class SammysRentalPrice{
      
      public static final int RENTAL_PER_HOUR = 40;
      
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tS Sammy's makes it fun in the sun S");
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
         System.out.println();
         System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter the number of minutes you rented a sport equipment: ");
         int totalMinutes = scanner.nextInt();
         int hours = totalMinutes / 60;
         int minutes = totalMinutes % 60;
         float totalPrice = (RENTAL_PER_HOUR * hours) + minutes;
         if(totalMinutes < 60){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHours: "+ hours);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMinutes: "+ totalMinutes);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Price: $"+ RENTAL_PER_HOUR);
         }
         else{
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHours: "+ hours);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAdditional $1 per minute: "+ minutes);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Minutes: "+ totalMinutes);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Price: $"+ totalPrice);

         }
         scanner.close();
     }
}