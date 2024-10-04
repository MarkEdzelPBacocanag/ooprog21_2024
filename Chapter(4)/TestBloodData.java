import java.util.*;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData blood_data = new BloodData();
        Scanner scan;
            scan = new Scanner(System.in);

        //Asks the User to input blood type
        System.out.println("Enter your Blood Type: ");
        String blood_Type = scan.nextLine();
        blood_data.setBloodType(blood_Type);

        //Asks the User to input the Rh factor
        System.out.println("Enter your Rh Factor: ");
        String rh_factor =scan.nextLine();
        blood_data.setRhFactor(rh_factor);
        
        scan.close();
        
        blood_data.defaultPatient();
        System.out.println(" ");
        blood_data.displayBloodInfo();
    }
}
