import java.util.*;

public class TestBloodData {
    public static void main(String[] args) {
        String blood_Type;
        String rh_factor;
        BloodData blood_data = new BloodData();
        Scanner scan;
            scan = new Scanner(System.in);

        //Asks the User to input blood type
        while(true){
            System.out.println("Enter your Blood Type: ");
            blood_Type = scan.nextLine();
            blood_data.setBloodType(blood_Type);

            //This prompts the user to input a value for the Blood Type
            if(blood_Type.isEmpty()){
                System.out.println("Please Enter Blood Type [A, B, O, AB].");
            } else if (blood_Type.equals("A")  || blood_Type.equals("B")  || blood_Type.equals("O") || blood_Type.equals("AB") ) {
                break;
            } else if (!blood_Type.equals("A")  || !blood_Type.equals("B")  || !blood_Type.equals("O") || !blood_Type.equals("AB") ){
                System.out.println("Please Enter Blood Type [A, B, O ,AB] Only.");
            }
            
        }

        while (true) { 
            //Asks the User to input the Rh factor
            System.out.println("Enter your Rh Factor: ");
            rh_factor =scan.nextLine();
            blood_data.setRhFactor(rh_factor);
            
            //This prompts the user to input value for the RH Facture
            if(rh_factor.equals("-") || rh_factor.equals("+")){
                break;
                }else if(rh_factor.isEmpty() || !rh_factor.equals("-") || !rh_factor.equals("+")){
                    System.out.println("Please Enter RH Factor [ -, +] Only");
                    }
            
        }
        
        scan.close();
        blood_data.displayBloodInfo();
        System.out.println(" ");
        blood_data.defaultPatient();
        
        
    }
}
