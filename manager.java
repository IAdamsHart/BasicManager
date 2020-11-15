import java.util.*;

public class manager {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      try {
            System.out.println("\nAdd employee? y/n");

            String response = in.nextLine();

            if (response.equals("y"))
            {
               System.out.println("\nPlease enter name:");
               String name = in.nextLine();

               System.out.println("\nPlease enter ID:");
               String ID = in.nextLine();

               Employee emp = new Employee(name, ID);

               System.out.println("\nYou have entered:\n" + emp);
            }
      } finally {
         in.close();
      }
         System.out.println("\nProgram Terminated");
   }
}