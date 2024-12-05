public class Driver {
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN + Text.HIDE_CURSOR);
    for (int i = 0; i < 80; i++){
      for (int k = 0; k < 30; k++){
        if (!(i == 0 || i == 79) && !(k == 0 || k == 29)){
          k += 27;
          continue;
        }
        Text.go(k+1, i+1);
        Text.color(Text.WHITE, Text.background(Text.WHITE));
        System.out.print(".");
      }
    }

    Text.go(31, 1);
    System.out.println(Text.RESET);
  }
}
