public class MyArrays {
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }

  public static String arrayToString(int[] ary) {
    String out = "[";
    for (int i = 0; i < ary.length; i++) {
      out += ary[i];
      if (i != ary.length - 1) {
        out += ", ";
      }
    }
    return out + "]";
  }

  public static int[] returnCopy(int[] ary) {
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      copy[i] = ary[i];
    }
    return copy;
  }
}
