import java.util.ArrayList;

public class ArrayListPractice{

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> ary = new ArrayList<String>(size);


    for (int i = 0; i < size; i++){
        int index = (int)(11*Math.random());

        if(index == 0){
          ary.add("");

        }
        else{
          ary.add("" + index);
        }
    }
    return ary;
  }
  public static void replaceEmpty(ArrayList<String> original){
    for (int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }
  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> newArray = new ArrayList<String>(original.size());

    for (int i = 0; i < original.size(); i++){
      newArray.set(i, original.get(original.size() - i - 1));
    }
    return newArray;
  }
  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){

    ArrayList<String> newArray = new ArrayList<String>(a.size() + b.size());
    int smallest = Math.min(a.size(), b.size());
    for (int i = 0; i < smallest; i++){
      newArray.add(a.get(i));
      newArray.add(b.get(i));
    }
    for (int i = 0; i < Math.abs(a.size() - b.size()); i++){
      if (a.size() > b.size()){
        newArray.add(a.get(smallest + i));
      } else {
        newArray.add(b.get(smallest + i));
      }
    }
    return newArray;
  }
}
