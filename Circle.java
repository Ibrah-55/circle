import java.util.Scanner;
class Circle {
    double area;
      public Circle(double radius) {
      area = radius * radius * Math.PI;
    }
  public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      Circle  a=new Circle(rad);
      System.out.println("Area of Circle is: " + a.area);   
    }
  }
