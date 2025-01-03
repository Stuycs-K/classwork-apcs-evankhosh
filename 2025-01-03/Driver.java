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

  public static String toWords(int n){
    if (n < 20){
      if (n == 0) { return ""; }
      if (n == 1) { return "one"; }
      if (n == 2) { return "two"; }
      if (n == 3) { return "three"; }
      if (n == 4) { return "four"; }
      if (n == 5) { return "five"; }
      if (n == 6) { return "six"; }
      if (n == 7) { return "seven"; }
      if (n == 8) { return "eight"; }
      if (n == 9) { return "nine"; }
      if (n == 10) { return "ten"; }
      if (n == 11) { return "eleven"; }
      if (n == 12) { return "twelve"; }
      if (n == 13) { return "thirteen"; }
      if (n == 14) { return "fourteen"; }
      if (n == 15) { return "fifteen"; }
      if (n == 16) { return "sixteen"; }
      if (n == 17) { return "seventeen"; }
      if (n == 18) { return "eighteen"; }
      if (n == 19) { return "nineteen"; }
    }
    if (n < 100){
      if (n/10 == 2) {return "twenty-" + toWords(n%10); }
      if (n/10 == 3) {return "thirty-" + toWords(n%10); }
      if (n/10 == 4) {return "forty-" + toWords(n%10); }
      if (n/10 == 5) {return "fifty-" + toWords(n%10); }
      if (n/10 == 6) {return "sixty-" + toWords(n%10); }
      if (n/10 == 7) {return "seventy-" + toWords(n%10); }
      if (n/10 == 8) {return "eighty-" + toWords(n%10); }
      if (n/10 == 9) {return "ninety-" + toWords(n%10); }
    }
  }
}
