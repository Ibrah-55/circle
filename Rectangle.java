import java.util.Scanner;

class Rectangle
{
    double length;
    double breadth;

     public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }

    public static void main(String arg[])
    {
        Scanner len = new Scanner(System.in);
        System.out.println("Enter the Lenghth: ");
        Scanner bre = new Scanner(System.in);
        double leng= len.nextDouble();
        System.out.println("Enter the Breadth");
        double brea=bre.nextDouble();
        Rectangle r=new Rectangle(leng, brea);
        
        System.out.println("The Length is = " + leng);
        System.out.println("The Breadth is = " + brea);
        System.out.println("The Perimeter is = " + r.getPerimeter());

    }}