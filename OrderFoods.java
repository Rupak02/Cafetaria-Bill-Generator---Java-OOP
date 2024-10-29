import java.util.*;

public class OrderFoods {
    Scanner sc = new Scanner(System.in);
    int frenchFries = 70;
    int burger = 120;
    int pizza = 150;
    int coke = 80;
    int chickenFry = 90;

    int choice;
    int quantity;
     int total;
    String again;
    void display(){
        System.out.println("*** Welcome to DailyFresh Cafe ***");
        System.out.println("     1 . French Fries             ");
        System.out.println("     2 . Burger                   ");
        System.out.println("     3 . Pizza                    ");
        System.out.println("     4 . Chicken Fry              ");
        System.out.println("     5 . Coke                     ");
        System.out.println("----What would you like to order?----");
    }

    void generateBill(int total){
        System.out.println("Thank You for Ordering");
        System.out.println("Your Bill is Rs. "+total+" /-");
        System.out.println("*** Thank You, Visit Again! ***");
    }
    void order(){
        while(true) {
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have Selected French Fries");
                    System.out.println("Enter the Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;
                    break;
                case 2:
                    System.out.println("You have Selected Burger");
                    System.out.println("Enter the Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;
                    break;
                case 3:
                    System.out.println("You have Selected Pizza");
                    System.out.println("Enter the Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;
                    break;
                case 4:
                    System.out.println("You have Selected Chicken Fry");
                    System.out.println("Enter the Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * chickenFry;
                    break;
                case 5:
                    System.out.println("You have Selected Coke");
                    System.out.println("Enter the Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * coke;
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
            System.out.println("Would you like to order more : Y/N");
            again = sc.next();
            if(again.equals("Y") || again.equals("y")){
                order();
            } else if (again.equals("N") || again.equals("n")) {
                generateBill(total);
                System.exit(1);
            }else{
                System.out.println("Invalid choice");
            }
        }
    }
}
