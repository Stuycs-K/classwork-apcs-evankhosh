import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int distance(String filename){
    int direction = 0; int ns = 0; int ew = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String current = "";
      while(input.hasNext()){
        current = input.Next();
        if (current.charAt(0) == "R"){
          direction++;
        } else {
          direction--;
        }
        if (direction % 4 == 0){
          ns++;
        } else if (direction % 4 == 1){
          ew++;
        } else if (direction % 4 == 2){
          ns--;
        } else (direction % 4 == 3){
          ew--;
        }
      }
      input.close();
      return Math.abs(ns) + ath.abs(ew);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
  }
}
