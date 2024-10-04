public class testCircle {
    /* <----Static variables---->*/
    public  double radius;
    public  double diameter;
    public  double area;
    /* <----Constructor---->*/
    public testCircle(){
        this.radius = 1;
        this.diameter = 2*radius;
        this.area = 3.142 * radius * radius;
    }
    public void setRadius(double rad){
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
    /* <----Main Method---->*/    
    public static void main(String[] args) {
        testCircle a = new testCircle();
        testCircle b = new testCircle();
        testCircle c = new testCircle();

        a.setRadius(3);
        b.setRadius(20);

        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

        System.out.println("Radius of the Second circle: " + b.getRadius());
        System.out.println("Diameter of the Second circle: " + b.getDiameter());
        System.out.println("Area of the Second circle: " + b.getArea());

    }
}
