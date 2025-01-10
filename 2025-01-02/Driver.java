//Largest number that can be caluclated under 10s is 46
///Largest fibonnaci number that fits in an integer is 46
public class Driver{

  public static void main(String[] args){
    //System.out.println(fib(Integer.parseInt(args[0])));
    for (int i = 0; i > -1; i++){
      if (fib(i) < 0){
        System.out.println(i-1);
        break;
      }
    }
  }

  public static int fib(int n){
    if (n < 2){
      return n;
    }
    return fib(n-1) + fib(n-2);
  }
}

//pleeeeease work
