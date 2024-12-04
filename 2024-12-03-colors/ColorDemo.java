public class ColorDemo {
  public static String BLACK = "30";

  public static void main(String[] args){
    String[] colors = new String[]{"48;2;255;0;0;7", "48;2;255;127;0;7", "48;2;255;255;0;7", "48;2;127;255;0;7", "48;2;0;255;0;7", "48;2;0;255;127;7", "48;2;0;255;255;7", "48;2;0;127;255;7", "48;2;0;0;255;7", "48;2;127;0;255;7", "48;2;255;0;255;7", "48;2;255;0;127;7"};
    for (int i = 0; i < 100; i++){
      for (int k = 0; k < colors.length; k++){
        for (int j = 0; j < colors.length; j++){
          color(BLACK, colors[(j+k)%colors.length]);
          System.out.print(".");
        }
      }
      sleep(50);
    }
    System.out.print("\u001b[0m");
  }

  public static void color(String foreground, String background){
    System.out.print( "\u001b[" + foreground + ";" + background + "m");
  }

  public static void color(int foreground, int background, int[] modifiers){
    String mods = "";
    for (int i = 0; i < modifiers.length; i++){
      mods += ";" + modifiers[i];
    }
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + mods + "m");
  }

  public static void sleep(int milli){
    try{
      Thread.sleep(milli);
    }catch(Exception e){
    }
  }
}
