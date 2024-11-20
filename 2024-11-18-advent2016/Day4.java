import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4 {
  private static String[] parseFile(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String data = input.next("-");
      while (input.hasNext()){
        data += ", " + input.next("-");
      }
      input.close();
      return data.split(", ");
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int sumRealIDs(String filename){
    String[] data = parseFile(filename);
  }
}
