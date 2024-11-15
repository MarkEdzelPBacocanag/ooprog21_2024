import java.util.*;

public class Palindrome{

   public static void main(String[] args){
      String word;
      
      Scanner scn;
      scn = new Scanner(System.in);
      
      System.out.println("Enter a word: ");
      word = scn.nextLine();
      scn.close();
      
      boolean result = isPalindrome(word);
      
      if(result == true){
         
         System.out.println("This " + word + " is Palindrome");
      
      }else {
      
         System.out.println("This " + word + " is not Palindarome");
      
      }
}
      
   public static boolean isPalindrome(String word){
         
         int left = 0;
         int right = word.length() - 1; 
         
         while(left < right){
         
            if(word.charAt(left) != word.charAt(right)){
            
               return false;
            
            }
         left++;
         right--;
         }  
         return true;
      }
   }