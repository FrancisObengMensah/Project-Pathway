import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        //Scanner Input 
        Scanner Input= new Scanner(System.in);

        //Asking user for first values
        System.out.println("Enter your first value:");
        double num1 = Input.nextDouble();

        //Asking user for second value
        System.out.println("Enter the second value");
        double num2 = Input.nextDouble();

        //Choose your operation method
         System.out.println("Choose an operation (+, /, -, *)");
         char operator = Input.next().charAt(0);

         double result = 0;
         boolean validOperation = true;

         Switch (operator) {
            case '+' :
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*' :
            result = num1 * num2;
            break;
            case '/' :
            if (num2 != 0) {

                {
                    System.out.println("Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
                validOperation = false;
        } 

         


         }

        }

    }
    

