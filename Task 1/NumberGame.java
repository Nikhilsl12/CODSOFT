import java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Attempt: " + i + " out of " + 5);
            System.out.println("Enter any Number between 1 and 100 ");
            int Number = sc.nextInt();
            int gen_Number = random.nextInt(100)+1;
            boolean result = gen_Number == Number;
            System.out.println("Generated Number " + gen_Number);
            System.out.println("Entered Number is " + Number);
            System.out.println("Result: " + (result ? "Your guess is right " : "Try again "));
            System.out.println();
        }
    }
}