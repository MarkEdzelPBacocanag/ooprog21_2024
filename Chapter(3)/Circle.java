
public class Circle {
/* <----Static variables---->*/
    public static double radius;
    public static double diameter;
    public static double area;
/* <----Constructor---->*/
    public Circle(){
        radius = 1;
        diameter = 2*radius;
        area = 3.142 * radius * radius;

    }

    public static void setRadius(double rad){
        radius = rad;
        diameter = 2*radius;
        area = 3.142 * radius * radius;
    }
/* <----Getter---->*/
    public static double getRadius(){
        return radius;
    }
    public static double getDiameter(){
        return diameter;
    }
    public static double getArea(){
        return area;
    }
    public static void main(String[] args){
        Circle circle = new Circle();

        System.out.println("Current Radius: " + getRadius());
        System.out.println("Current Diameter: " + getDiameter());
        System.out.println("Current Area: " + getArea());
    }
}
