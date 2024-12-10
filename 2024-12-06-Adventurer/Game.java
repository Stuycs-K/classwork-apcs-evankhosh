import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    CodeWarrior codeWarrior; String codeWarriorInput; String[] codeWarriorInputArr;
    NeCromedian neCromedian; String neCromedianInput; String[] neCromedianInputArr;

    //Set up CodeWarrior
    while (true){
      System.out.println("Enter your Code Warrior's Name, HP, and Coding Language:");
      codeWarriorInput = userInput.nextLine();
      codeWarriorInputArr = codeWarriorInput.split(" ");
      try{
        codeWarrior = new CodeWarrior(codeWarriorInputArr[0], Integer.parseInt(codeWarriorInputArr[1]), codeWarriorInputArr[2]);
        break;
      }
      catch (Exception ex){
        System.out.println("Bad input. Try again with the format: \"Name HP(numbers only) Language\".");
        continue;
      }
    }

    //Set up NeCromedian
    while (true){
      System.out.println("Enter your NeCromedian's Name and HP:");
      neCromedianInput = userInput.nextLine();
      neCromedianInputArr = neCromedianInput.split(" ");
      try{
        neCromedian = new NeCromedian(neCromedianInputArr[0], Integer.parseInt(neCromedianInputArr[1]));
        break;
      }
      catch (Exception ex){
        System.out.println("Bad input. Try again with the format: \"Name HP(numbers only)\".");
        continue;
      }
    }

    System.out.println(codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
    System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName());
  }
}
