public class MyArrays {
  public static void main(String[] args) {
    int[] ary1 = new int[]{1, 2, 3};
    int[] ary2 = returnCopy(ary1);
    int[] ary3 = new int[]{};
    int[] ary4 = returnCopy(ary3);
    System.out.println("Is it a new array: " + (ary1 != ary2) + ", Do they have the same values: " + arrayToString(ary1).equals(arrayToString(ary2)));
    System.out.println("Is it a new array: " + (ary3 != ary4) + ", Do they have the same values: " + arrayToString(ary3).equals(arrayToString(ary4)));
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
