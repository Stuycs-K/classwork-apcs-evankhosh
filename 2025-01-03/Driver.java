public class Driver{
  public static void main(String[] args){
    makeWords(Integer.parseInt(args[0]), "", args[1]);
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 1){
      for (char letter : alphabet.toCharArray()){
        System.out.println(result + letter);
      }
    }
    else {
      for (char letter : alphabet.toCharArray()){
        makeWords(remainingLetters - 1, result + letter, alphabet);
      }
    }
  }
}
