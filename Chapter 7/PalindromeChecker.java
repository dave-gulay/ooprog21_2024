import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
    
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
        
        scanner.close();
    }
}