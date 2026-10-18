import java.util.Scanner;

public class Calculater {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);


        while (true) {
            
            
               System.err.println("Press 1 For + ");
               System.err.println("Press 2 For - ");
               System.err.println("Press 3 For * ");
               System.err.println("Press 4 For / ");
               System.err.println("Press 0 For Exit ");
               int choice = sc.nextInt();

               if(choice == 0) break;
               
               System.err.print(" Enter Two Number :  "); int a = sc.nextInt() ; int  b = sc.nextInt();

            if(choice == 1)     { System.err.println( "Sum : " + (a+b)); }
            else if(choice == 2){ System.err.println( "Sub : " + (a-b)); }
            else if(choice == 3){ System.err.println( "Pro : " + a*b); }
            else if(choice == 4){ System.err.println( "Division : " + (a/b) ); }

        }


    sc.close();

}
    
}
