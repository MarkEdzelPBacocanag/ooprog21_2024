public class BloodData {
    private String bloodType;
    private String rhFactor;

    //setting the value for the Blood Type
    public void setBloodType(String blood_Type){
        this.bloodType = blood_Type;
    }
    //setting the value of the RH Factor
    public void setRhFactor(String rh_Factor){
        this.rhFactor = rh_Factor;
    }

    //getting the value for the blood type
    public String getBloodType(){
        return bloodType;
    }

    //getting the value for the rh factor
    public String getRhFactor(){
        return rhFactor;
    }
    //Displays the defaultPatient Blood Type and RH Factor
    public void defaultPatient(){
        bloodType = "A";
        rhFactor = "-"; 

        System.out.println("Default patient Blood Type and Rh Factor");
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Rh Factor: " + rhFactor);
    }

    //This will displays the Blood Type and RH value of the user
    public void displayBloodInfo(){
        System.out.println("Your Blood Type: " + bloodType);
        //this will check if there an input from the user
        //if there's none the default value of the RH Factor will display       
        if(rhFactor.isEmpty()){
                    System.out.println("Your RH Factor: -");
            }else{
                System.out.println("Your Rh Factor: +");
            }
    }



}