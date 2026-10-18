import java.util.Scanner;

public class AddingTwoNumber {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.print("Enter 2 Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.err.println();
        System.err.println("The Sum of Two Number is : " + (a+b));

        sc.close();

    }

}
