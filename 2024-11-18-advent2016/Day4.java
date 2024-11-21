import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day4 {
  private static String[][] parseFile(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String data = input.nextLine();
      while (input.hasNextLine()){
        data += ", " + input.nextLine();
      }
      input.close();
      String[] dataArr = data.split(", ");
      String[][] dataArrArr = new String[dataArr.length][];
      for (int i = 0; i < dataArr.length; i++){
        dataArrArr[i] = dataArr[i].split("-");
      }
      return dataArrArr;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int sumRealIDs(String filename){
    String[][] data = parseFile(filename);
    System.out.println(Arrays.deepToString(data));
    return 0;
  }
}
