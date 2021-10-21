/*public class Main {
    public static void main(String[] args) {
      System.out.println("Hello World");
      int randNu = (int)(Math.random() * 101);
      System.out.println(randNu);
    }
  } */
public class Main{
  static int myMethod  (int x, int y){
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println("This is Kenya");
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[1]);
    System.out.println(myMethod(5, 6));

    int [][] myNumbers={{1,2,4,5,6}, {9,8,7,5,3}};
    for (int i=0; i<myNumbers.length; ++i){
      for (int j=0; j<myNumbers[1].length; ++j){
        System.out.println(myNumbers[i][j]);

      }
    
  }
  }
}