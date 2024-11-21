import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

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
      return abs(y) + abs(x);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int returnDistance(String filename){
    int direction = 0; int y = 0; int x = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String current = ""; int dis;
      ArrayList<Coordinate> coords = new ArrayList<>();
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
          for (int i = 0; i < dis; i++){
            y++;
            coords.add(new Coordinate(x, y));
            for (int k = 0; k < coords.size() - 1; k++){
              if (coords.get(k).equals(coords.get(coords.size() - 1))){ return abs(y) + abs(x); }
            }
          }
        } else if (direction % 4 == 1){
          for (int i = 0; i < dis; i++){
            x++;
            coords.add(new Coordinate(x, y));
            for (int k = 0; k < coords.size() - 1; k++){
              if (coords.get(k).equals(coords.get(coords.size() - 1))){ return abs(y) + abs(x); }
            }
          }
        } else if (direction % 4 == 2){
          for (int i = 0; i < dis; i++){
            y--;
            coords.add(new Coordinate(x, y));
            for (int k = 0; k < coords.size() - 1; k++){
              if (coords.get(k).equals(coords.get(coords.size() - 1))){ return abs(y) + abs(x); }
            }
          }
        } else if (direction % 4 == 3){
          for (int i = 0; i < dis; i++){
            x--;
            coords.add(new Coordinate(x, y));
            for (int k = 0; k < coords.size() - 1; k++){
              if (coords.get(k).equals(coords.get(coords.size() - 1))){ return abs(y) + abs(x); }
            }
          }
        }
      }
      input.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int abs(int x){
    if (x < 0) { return -x; }
    else { return x; }
  }
}
