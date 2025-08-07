import java.util.Scanner;

public class dataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter value of Integer: ");

        // int a = sc.nextInt();

        // //int a = 5;
        // System.out.println("The value of Integer: " + a);

        // System.out.println("Enter value of Double: ");

        // double b = sc.nextDouble();

        // System.out.println("The value of Double: " + b);

        // System.out.println("Enter value of character: ");

        // char c = sc.next().charAt(0);

        // System.out.println("Character: " + c);

        // System.out.println("Enter String: ");

        // String str = sc.next();

        // System.out.println("String: " + str);

        System.out.println(" ");

        System.out.println(" Enter X: ");

        int x = sc.nextInt();      
        
        int y = sc.nextInt();

        System.out.println("Sum: "+ (x+y));


        sc.close();

    }

}