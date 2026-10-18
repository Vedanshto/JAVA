import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);

        System.err.print("Enter A Number : ");
        int n = sc.nextInt();

        System.err.println();


        System.err.println("Your Entered Number Is : " + n);

    }
}
