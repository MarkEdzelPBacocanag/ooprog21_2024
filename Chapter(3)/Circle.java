import java.util.*;
public class Circle {
/* <----Static variables---->*/
    public  double radius;
    public  double diameter;
    public  double area;
/* <----Constructor---->*/
    public Circle(){
        this.radius = 1;
        this.diameter = 2*radius;
        this.area = 3.142 * radius * radius;

    }

    public  void   setRadius(double rad){
        this.radius = rad;
        this.diameter = 2*radius;
        this.area = 3.142 * radius * radius;
    }
/* <----Getter---->*/
    public  double getRadius(){
        return radius;
    }
    public  double getDiameter(){
        return diameter;
    }
    public  double getArea(){
        return area;
    }
    public static void main(String[] args){
        Circle circle = new Circle();
        Scanner scan;
        scan = new Scanner(System.in);

        System.out.println("Current Radius: " + circle.getRadius());
        System.out.println("Current Diameter: " + circle.getDiameter());
        System.out.println("Current Area: " + circle.getArea());

        System.out.print("\nEnter radius: ");
        double rad = Double.parseDouble(scan.nextLine());
        circle.setRadius(rad);
        scan.close();

        System.out.println("Current Radius: " + circle.getRadius());
        System.out.println("Current Diameter: " + circle.getDiameter());
        System.out.println("Current Area: " + circle.getArea());
    }
}
