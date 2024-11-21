import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

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

  //Doesn't work
  /* 
  public static int sumRealIDs(String filename){ 
    String[][] data = parseFile(filename);
    ArrayList<Integer> order = new ArrayList<Integer>(); order.add(0);
    int sum = 0;
    for (int i = 0; i < data.length; i++){
      System.out.println("i: " + i);
      for (int k = 0; k < data.length - 1; k++){
        System.out.println("k: " + k);
        int orderPlace = 0;
        while (data[i][k].length() < data[i][order.get(orderPlace)].length() || (data[i][k].length() == data[i][order.get(orderPlace)].length() && data[i][k].charAt(0) > data[i][order.get(orderPlace)].charAt(0))){ orderPlace++; }
        order.add(orderPlace, k);
        System.out.println(order);
      } 
      String code = "";
      for (int k = 0; k < 5; k++){
        code += data[i][order.get(k)].charAt(0);
      }
      if (code.equals(data[i][data.length - 1].substring(4, 9))) { sum += Integer.parseInt(data[i][data.length - 1].substring(1, 4)); }
    }
    System.out.println(":" + sum + ":");
    return sum;
  }
  */
}
