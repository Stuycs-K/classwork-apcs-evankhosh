public class ColorDemo {
  public static void main(String[] args){

  }

  public static void color(int foreground, int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
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
