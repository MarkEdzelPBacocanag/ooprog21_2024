import java.util.*;

public class SortingThreeNumbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[] value = new double[3];

        System.out.println("Please enter your first value");
        value[0]  = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter your second value");
        value[1] = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter your third value");
        value[2] = Double.parseDouble(scan.nextLine());
        scan.close();
        for(int i = 0; i < value.length; i++){
            for(int j = 0; j < value.length - i - 1; j++){
                if(value[j] < value[j + 1]){
                    double temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending Order: ");
        for (int i = 0; i < value.length; i++) {
            System.out.println("\tValue[" + (i+1) + "]" + value[i]);
        }
        for(int i = 0; i < value.length; i++){
            for(int j = 0; j < value.length - i - 1; j++){
                if(value[j] > value[j + 1]){
                    double temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                }
            }
        }
        System.out.println("\n Descending Order: ");
        for (int i = 0; i < value.length; i++) {
            System.out.println("\tValue[" + (i + 1) + "]" + value[i]);
        }
    }
}
