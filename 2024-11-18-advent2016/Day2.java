import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
  private static String[] parseFile(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String data = input.next();
      while (input.hasNext()){
        data += ", " + input.next();
      }
      input.close();
      return data.split(", ");
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
  }
}

  public static int bathroomCode(String filename){
    String[] data = parseFile(filename);
    Coordinate coord = new Coordinate(1, 1);
    int code = 0;
    for (String s : data){
      for (int i = 0; i < s.length(); i++){
        coord.change(s.charAt(i));
      }
      code = code * 10 + coord.numPad();
    }
    return code;
  }

  public static String bathroomCodeDia(String filename){
    String[] data = parseFile(filename);
    Coordinate coord = new Coordinate(0, 2);
    String code = "";
    for (String s : data){
      for (int i = 0; i < s.length(); i++){
        coord.changeDia(s.charAt(i));
      }
      code += coord.diaPad();
    }
    return code;
  }
}
