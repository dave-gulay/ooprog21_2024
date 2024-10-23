import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers (press enter after each number): ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        
        int smallest, middle, largest;
        
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
            if (num2 <= num3) {
                middle = num2;
                largest = num3;
            } else {
                middle = num3;
                largest = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
            if (num1 <= num3) {
                middle = num1;
                largest = num3;
            } else {
                middle = num3;
                largest = num1;
            }
        } else {
            smallest = num3;
            if (num1 <= num2) {
                middle = num1;
                largest = num2;
            } else {
                middle = num2;
                largest = num1;
            }
        }
        
        System.out.println("Numbers in ascending order: " + smallest + " " + middle + " " + largest);
        System.out.println("Numbers in descending order: " + largest + " " + middle + " " + smallest);
        
  
        scanner.close();
    }
}