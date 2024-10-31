import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{

  public static void main(String[] args) {
  }

  public static boolean isTriangle(String input){
    Scanner sc = new Scanner(input);
    s0 = sc.nextInt(); s1 = sc.nextInt(); s2 = sc.nextInt();
    return (s0 + s1 > s2 && s1 + s2 > s0 && s2 + s0 > s2);
  }
}
