/*Ken Harvey Doblas BSIT 2B
  ACTIVITY 1.0   9/6/23
*/
import java.util.Scanner;

public class Activity01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Rat rat = new Rat();
        Dog dog = new Dog();
        Snake snake = new Snake();

        System.out.println("========== Activity 1: What does the animal say? ==========");

        Scanner scanner = new Scanner(System.in);

        int choice;
        char ans;

        do {
            System.out.println("Choose an animal:");
            System.out.println("1. Cat");
            System.out.println("2. Rat");
            System.out.println("3. Dog");
            System.out.println("4. Snake");
            System.out.print("Enter your choice: ");
           
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cat.makeSound();
                    break;
                case 2:
                    rat.makeSound();
                    break;
                case 3:
                    dog.makeSound();
                    break;
                case 4:
                    snake.makeSound();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }
            
            System.out.println("\nDo you wish to try again? [Y/N]");
            ans = scanner.next().charAt(0);
        } while (ans == 'Y' || ans == 'y');

        System.out.println("Thank you & Goodbye!");

        scanner.close();
    }
}

class Cat {
    public void makeSound() {
        System.out.println("CAT");
        System.out.println("Meow! Meow!");
    }
}

class Rat {
    public void makeSound() {
        System.out.println("RAT");
        System.out.println("Squeak! Squeak!");
    }
}

class Dog {
    public void makeSound() {
        System.out.println("DOG");
        System.out.println("Arf! Arf!");
    }
}

class Snake {
    public void makeSound() {
        System.out.println("SNAKE");
        System.out.println("SHH! SHH!");
    }
}
