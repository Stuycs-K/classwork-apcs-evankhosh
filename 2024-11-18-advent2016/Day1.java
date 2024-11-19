import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int distance(String filename){
    int direction = 0; int y = 0; int x = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String current = ""; int dis;
      while(input.hasNext()){
        current = input.next();
        if (input.hasNext()){
          dis = Integer.parseInt(current.substring(1, current.length()-1));
        } else{
          dis = Integer.parseInt(current.substring(1));
        }
        if (current.charAt(0) == 'R'){
          direction += 5;
        } else {
          direction += 3;
        }
        if (direction % 4 == 0){
          y += dis;
        } else if (direction % 4 == 1){
          x += dis;
        } else if (direction % 4 == 2){
          y -= dis;
        } else if (direction % 4 == 3){
          x -= dis;
        }
      }
      input.close();
      return Math.abs(y) + Math.abs(x);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
}
