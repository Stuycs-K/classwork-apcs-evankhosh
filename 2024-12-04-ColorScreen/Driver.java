import java.util.Random;

public class Driver {
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN + Text.HIDE_CURSOR);
    Text.color(Text.BLUE, Text.background(Text.BLUE));
    for (int i = 0; i < 80; i++){
      for (int k = 0; k < 30; k++){
        if (!(i == 0 || i == 79) && !(k == 0 || k == 29)){
          continue;
        }
        Text.go(k+1, i+1);
        System.out.print(".");
      }
    }
    Text.go(3, 2);
    Text.color(Text.RED, Text.background(Text.RED));
    System.out.print("------------------------------------------------------------------------------");

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

    System.out.print(Text.RESET + Text.HIDE_CURSOR);
    Text.color(Text.WHITE, Text.background(Text.WHITE));
    for (int i = 1; i < 27; i++){
      Text.go(i+3, 2);
      System.out.print("------------------------------------------------------------------------------");
    }
    //21x18
    //Black Lines of Charmander
    Text.color(Text.BLACK, Text.background(Text.BLACK));
    Text.go(8, 28); System.out.println("--");
    Text.go(8, 48); System.out.println("--------");
    Text.go(9, 26); System.out.println("--");
    Text.go(9, 30); System.out.println("--");
    Text.go(9, 46); System.out.println("--");
    Text.go(9, 56); System.out.println("--");
    Text.go(10, 24); System.out.println("--");
    Text.go(10, 30); System.out.println("--");
    Text.go(10, 44); System.out.println("--");
    Text.go(10, 58); System.out.println("--");
    Text.go(11, 24); System.out.println("--");
    Text.go(11, 30); System.out.println("--");
    Text.go(11, 44); System.out.println("--");
    Text.go(11, 58); System.out.println("--");
    Text.go(12, 22); System.out.println("--");
    Text.go(12, 32); System.out.println("--");
    Text.go(12, 42); System.out.println("--");
    Text.go(12, 60); System.out.println("--");
    Text.go(13, 22); System.out.println("--");
    Text.go(13, 32); System.out.println("--");
    Text.go(13, 42); System.out.println("--");
    Text.go(13, 50); System.out.println("--");
    Text.go(13, 52); System.out.print("\u001b[97;107m--"); System.out.print(Text.RESET + Text.HIDE_CURSOR); Text.color(Text.BLACK, Text.background(Text.BLACK));
    Text.go(13, 62); System.out.println("--");
    Text.go(14, 22); System.out.println("--");
    Text.go(14, 32); System.out.println("--");
    Text.go(14, 40); System.out.println("--");
    Text.go(14, 50); System.out.println("----");
    Text.go(14, 62); System.out.println("--");
    Text.go(15, 24); System.out.println("----");
    Text.go(15, 30); System.out.println("--");
    Text.go(15, 40); System.out.println("--");
    Text.go(15, 50); System.out.println("----");
    Text.go(15, 62); System.out.println("--");
    Text.go(16, 26); System.out.println("--");
    Text.go(16, 30); System.out.println("--");
    Text.go(16, 38); System.out.println("--");
    Text.go(16, 60); System.out.println("--");
    Text.go(17, 26); System.out.println("--");
    Text.go(17, 32); System.out.println("--");
    Text.go(17, 36); System.out.println("--");
    Text.go(17, 56); System.out.println("----");
    Text.go(18, 28); System.out.println("--");
    Text.go(18, 34); System.out.println("----");
    Text.go(18, 44); System.out.println("--");
    Text.go(18, 50); System.out.println("------");
    Text.go(19, 28); System.out.println("--");
    Text.go(19, 34); System.out.println("--");
    Text.go(19, 46); System.out.println("--");
    Text.go(19, 52); System.out.println("--");
    Text.go(20, 30); System.out.println("--");
    Text.go(20, 34); System.out.println("--");
    Text.go(20, 42); System.out.println("----");
    Text.go(20, 52); System.out.println("--");
    Text.go(21, 32); System.out.println("----");
    Text.go(21, 50); System.out.println("--");
    Text.go(21, 54); System.out.println("--");
    Text.go(22, 34); System.out.println("----");
    Text.go(22, 48); System.out.println("------");
    Text.go(23, 36); System.out.println("----");
    Text.go(23, 42); System.out.println("------");
    Text.go(24, 36); System.out.println("--");
    Text.go(24, 44); System.out.println("--");
    Text.go(25, 38); System.out.println("------");



    Text.go(31, 1);
    System.out.println(Text.RESET);
  }
}
