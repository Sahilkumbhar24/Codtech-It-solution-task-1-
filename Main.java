
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1- Addition \n 2- Subtraction \n 3- Multiplication \n 4- Division");
        System.out.println("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter first number: ");
        n1= sc.nextInt();
        System.out.println("Enter second number: ");
        n2= sc.nextInt();

        int result=0;
        switch (operator){
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("Entered operator is not valid");
        }
        System.out.println("Result is: " + result);
    }
}
