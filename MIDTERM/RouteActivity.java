import java.util.*;  
public class RouteActivity {
   public static void main(String[] args) {
      Route route = new Route();
      Scanner sc = new Scanner(System.in);
        
      try {
        
         System.out.println(" ___________________________ ");
         Thread.sleep(500);
         System.out.println("||      TRIP TO MOALBOAL     ||");
         Thread.sleep(500);
         System.out.println("|=============================|");    
         Thread.sleep(500);
         System.out.println("|        | Main Route |       |");
         Thread.sleep(500);
         System.out.println("|        |     ||     |       |");
         Thread.sleep(500);
         System.out.println("|        |     ||     |       |");
         Thread.sleep(500);
         System.out.println("|=============================|");
         System.out.println("|    ---Default Routes---     |");
         Thread.sleep(500);
         System.out.println("| Cebu City    ||  START      |");
         Thread.sleep(500);
         System.out.println("| Minglanilia  ||  Route 1    |");
         Thread.sleep(500);
         System.out.println("| San Fernando ||  Route 2    |");
         Thread.sleep(500);
         System.out.println("| Carcar       ||  Route 3    |");
         Thread.sleep(500);
         System.out.println("| Barili       ||  Route 4.1  |");
         Thread.sleep(500);
         System.out.println("| Dumanjug     ||  Route 4.1.1|");
         Thread.sleep(500);
         System.out.println("| Alcantara    ||  Route 4.1.2|");
         Thread.sleep(500);
         System.out.println("| Moalboal     ||  ARRIVED    |");
         Thread.sleep(500);
         System.out.println("|_____________________________|");
         Thread.sleep(500);

      }
        
      catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   
              
      char ans;
   
      do {
         System.out.print("\nIs there some road problem in Barili (Route 4)? [Y/N]: ");
         ans = sc.next().charAt(0);
      
         if (ans == 'Y' || ans == 'y') {
            System.out.println("Barili route is obstructed. Redirecting to Route 2 (R2).");
            break;
         } else if (ans == 'N' || ans == 'n') {
            break;
         } else {
            System.out.println("\nInvalid Input! Please enter 'Y' or 'N'.");
         }
      } while (true);
   
      double speed;
   
      if (ans == 'Y' || ans == 'y') {
         do {
            System.out.print("\nIs there some road problem in Dumanjug (Route 4.1.1)? [Y/N]: ");
            ans = sc.next().charAt(0);
         
            if (ans == 'Y' || ans == 'y') {
               System.out.println("\nDumanjug route is obstructed. Redirecting to Route 3 (R3).");
               speed = getSpeed(sc);
               route.r3();
               calculateArrivalTime(92.3, speed);
               break;
            } else if (ans == 'N' || ans == 'n') {
               System.out.println("\nSince Barili Route is obstructed. Redirecting to Route 2 (R2).");
               speed = getSpeed(sc);
               route.r2();
               calculateArrivalTime(94.0, speed);
               break;
            } else {
               System.out.println("\nInvalid Input! Please enter 'Y' or 'N'.");
            }
         } while (true);
      } else {
         System.out.println("\nSince there is no problem, I am recommending you to head on the Default Route.");
         speed = getSpeed(sc);
         route.defR();
         calculateArrivalTime(84.9, speed);
      }
   }

   static double getSpeed(Scanner sc) {
      double speed;
      while (true) {
         System.out.print("How fast are you going?: ");
         try {
            speed = sc.nextDouble();
            if (speed > 0) {
               return speed;
            } else {
               System.out.println("\nInvalid Input! Please enter a positive speed.");
            }
         } catch (InputMismatchException e) {
            System.out.println("\nInvalid Input! Please enter a numeric value.");
            sc.nextLine();
         }
      }
   }

   static void calculateArrivalTime(double distance, double speed) {
      double timeInHours = distance / speed;
      int hours = (int) timeInHours;
      int minutes = (int) ((timeInHours - hours) * 60);
      System.out.println("Estimated time of arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
   }
}


class Route {
   public void defR() {
      try{
           
         System.out.println("\nRecommended Default Routes: ");
         Thread.sleep(1000);
         System.out.println("Cebu City    |(START)      ");
         Thread.sleep(1000);
         System.out.println("Minglanilia  |(Route 1)    ");
         Thread.sleep(1000); 
         System.out.println("San Fernando |(Route 2)    ");
         Thread.sleep(1000);
         System.out.println("Carcar       |(Route 3)    ");
         Thread.sleep(1000);
         System.out.println("Barili       |(Route 4.1)  ");
         Thread.sleep(1000);
         System.out.println("Dumanjug     |(Route 4.1.1)");
         Thread.sleep(1000);
         System.out.println("Alcantara    |(Route 4.1.2)");
         Thread.sleep(1000);
         System.out.println("Moalboal     |(ARRIVED)    ");
         Thread.sleep(1000);
         System.out.println("Total distance that we are heading is:  84.9 km");
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
        
   }
   
   public void r2() {
      try{
           
            
         System.out.println("\nRecommended Routes (R2): ");
         Thread.sleep(1000);
         System.out.println("Cebu City    |(START)      ");
         Thread.sleep(1000);
         System.out.println("Minglanilia  |(Route 1)    ");
         Thread.sleep(1000);
         System.out.println("San Fernando |(Route 2)    ");
         Thread.sleep(1000);
         System.out.println("Carcar       |(Route 3)    ");
         Thread.sleep(1000);
         System.out.println("Sibonga      |(Route 4.2)  ");
         Thread.sleep(1000);
         System.out.println("Dumanjug     |(Route 4.2.1)");
         Thread.sleep(1000);
         System.out.println("Alcantara    |(Route 4.2.2)");
         Thread.sleep(1000);
         System.out.println("Moalboal     |(ARRIVED)    ");
         Thread.sleep(1000);
         System.out.println("Total distance that we are heading is:  94.0 km");
         Thread.sleep(1000);
         
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }
   
   public void r3() {
      try{
           
            
         System.out.println("\nRecommended Routes (R3): ");
         Thread.sleep(1000);
         System.out.println("Cebu City    (START)    ");
         Thread.sleep(1000);
         System.out.println("Minglanilia  (Route 1)  ");
         Thread.sleep(1000);
         System.out.println("San Fernando (Route 2)  ");
         Thread.sleep(1000);
         System.out.println("Carcar       (Route 3)  ");
         Thread.sleep(1000);
         System.out.println("Sibonga      (Route 4.2)");
         Thread.sleep(1000);
         System.out.println("Argao        (Route 5)  ");
         Thread.sleep(1000);
         System.out.println("Ronda        (Route 5.1)");
         Thread.sleep(1000);
         System.out.println("Alcantara    (Route 5.2)");
         Thread.sleep(1000);
         System.out.println("Moalboal     (ARRIVED)  ");
         Thread.sleep(1000);
         System.out.println("Total distance that we are heading is:  92.3 km");
         Thread.sleep(1000);
         
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
   }
}