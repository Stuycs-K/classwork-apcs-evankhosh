import java.util.ArrayList;

public class Driver {
   public static void main(String[] args){
    ArrayList<String> arr1 = ArrayListPractice.createRandomArray(20);

    System.out.println(arr1);

    ArrayListPractice.replaceEmpty(arr1);
    System.out.println(arr1);

    ArrayList<String> arr2 = ArrayListPractice.makeReversedList(arr1);
    System.out.println(arr2);

    arr1 = ArrayListPractice.createRandomArray(10);
    System.out.println(ArrayListPractice.mixLists(arr1, arr2));
   } 
}