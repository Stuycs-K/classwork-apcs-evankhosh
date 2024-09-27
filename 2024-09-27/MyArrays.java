public class MyArrays {
  public static void main(String[] args) {
    int[] ary1 = new int[]{1, 2, 3};
    System.out.println("Is it a new array: " + (ary1 != returnCopy(ary1)) + ", Do they have the same values: " + arrayToString(ary1).equals(arrayToString(returnCopy(ary1))));
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
