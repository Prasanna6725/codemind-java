import java.util.Scanner; // Import the Scanner class

public class MyClass {
  public static void main(String[] args) {
    int x, y, c;
    Scanner myObj = new Scanner(System.in); 
    x = myObj.nextInt(); 
    y = myObj.nextInt();  
    c = x + y;   
    System.out.println(c);
  }
} 