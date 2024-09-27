public class MyArrays {
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }
  public static String arrayToString(int[] nums) {
    String out = "[";
    for (int i = 0; i < nums.length; i++) {
      out += nums[i];
      if (i != nums.length - 1) {
        out += ", ";
      }
    }
    return out + "]";
  }
}
