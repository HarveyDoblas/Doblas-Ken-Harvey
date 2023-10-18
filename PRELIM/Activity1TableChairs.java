/* Ken Harvey Doblas 2B
   9/13/23
   Activity#1
*/


import java.util.Scanner;

class PEMDA {
       public static double add(double num1, double num2) {
        return num1 + num2;
    }

        public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

        public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;         }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + division(num1, num2));

        sc.close();   
          }
}