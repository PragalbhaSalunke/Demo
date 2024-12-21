import java.util.Scanner;

public class SumSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking three numbers as input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Find the smallest and largest
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        
        // Sum of the smallest and largest numbers
        int sum = smallest + largest;
        
        System.out.println("Sum of the smallest and largest numbers is: " + sum);
    }
}
