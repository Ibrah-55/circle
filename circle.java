public class circle{
    private double radius;
    
    public circle (double radius) {

        this.radius= radius;
        
        }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {

            return radius*radius*Math.PI;
            
            }



    /*static double area(double radius){
        //double z= 3.142 * radius * radius;
        return 3.142 * radius * radius;  
     }*/
    public static void main(String[] args) {
        circle c1 = new circle();


        System.out.println("The circle has radius of "

        + c1.setRadius() + " and area of " + c1.getArea());        
    }
}