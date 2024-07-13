public class RootofQuadratic {

  public static void main(String[] args) {

    double a = 1, b = -3, c = 2;
    double root1, root2;
    double determinant = b * b - 4 * a * c;
    if (determinant > 0) {
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.println("root1 =" +root1);
      System.out.println("root2 =" +root2);
    }

    else if (determinant == 0) {
      root1 = root2 = -b / (2 * a); 
      System.out.println("root1 =" +root1);
      System.out.println("root2 =" +root2);
    }
    
    else {
      
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);            
      System.out.println("Root 1: " +real+ " + " +imaginary+ "i");
      System.out.println("Root 2: " +real+ " - " +imaginary+ "i");
    }
  }
}