import java.util.*;

public class Billing{

public static void main(String[] args){


Scanner scan;
    scan = new Scanner(System.in);

   System.out.print("Please enter your Bill: ");
   double price = Double.parseDouble(scan.nextLine());
   System.out.print("How many items?: ");
   double quantity = Double.parseDouble(scan.nextLine());
   System.out.print("Coupon: ");
   double coupon = Double.parseDouble(scan.nextLine());
   computeBill(price);
   computeBill(price, (int)quantity);
   computeBill(price, (int)quantity, (int)coupon);

scan.close();

 }
//method for price
   public static double computeBill(double price){
   double totalPrices = price * 1.08;
   System.out.println("Total price for the bill is: $" + totalPrices);

   return totalPrices; 
 }
 
 //method for quantity
   public static double computeBill(double price, int quantity){
   //double totalPrice = computeBill(price * quantity);
   double totalCost = price * 1.08;
   double totalPrice = totalCost * quantity;
   
   System.out.println("Total price for the bill is: $" + totalPrice);
   
   return totalPrice;
 }

 //method for coupon
   public static double computeBill(double price, int quantity, int coupon){
   //double totalPrice = computeBill(price * quantity);
   double totalCost = price * 1.08;
   double totalPrice = totalCost * quantity;
   double discountedPrice = totalPrice - (totalPrice * coupon / 100.0) ;
   System.out.println("Total price for the bill is: $" + discountedPrice);
   
   return discountedPrice;
 }
}
