import java.util.Random;

public class Driver {
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN + Text.HIDE_CURSOR);
    for (int i = 0; i < 80; i++){
      for (int k = 0; k < 30; k++){
        if (!(i == 0 || i == 79) && !(k == 0 || k == 2 || k == 29)){
          continue;
        }
        Text.go(k+1, i+1);
        Text.color(Text.WHITE, Text.background(Text.WHITE));
        System.out.print(".");
      }
    }

    Random rand = new Random();
    Integer[] nums = new Integer[]{rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
    for (int i = 0; i < 3; i++){
      System.out.print(Text.RESET + Text.HIDE_CURSOR);
      Text.color(Text.WHITE);
      Text.go(2, 80 - 20*(3-i));
      if (nums[i] < 25){
        Text.color(Text.RED, Text.BRIGHT);
      }
      else if (nums[i] > 75){
        Text.color(Text.GREEN, Text.BRIGHT);
      }
      System.out.print(nums[i]);
    }

    Text.go(31, 1);
    System.out.println(Text.RESET);
  }
}
