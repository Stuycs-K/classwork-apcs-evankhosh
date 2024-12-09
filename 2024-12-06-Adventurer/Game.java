import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    String codeWarriorInput; String[] codeWarriorInputArr;

    while (true){
      System.out.println("Enter your Code Warrior's Name, HP, and Coding Language:");
      codeWarriorInput = userInput.nextLine();
      codeWarriorInputArr = String.split(codeWarriorInput);
      try{
        CodeWarrior(codeWarriorInputArr[0], Integer.parseInt(codeWarriorInputArr[1]), codeWarriorInputArr[2]);
        break;
      }
      catch Exception ex{
        System.out.println("Bad input. Try again.");
        continue;
      }
    }
  }
}
