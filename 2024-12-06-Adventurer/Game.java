import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    CodeWarrior codeWarrior; String codeWarriorInput; String[] codeWarriorInputArr;
    NeCromedian neCromedian; String neCromedianInput; String[] neCromedianInputArr;

    //Set up CodeWarrior
    while (true){
      System.out.println("Enter your Code Warrior's Name, HP, and Coding Language");
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
      System.out.println("Enter your Ne-Cromedian's Name and HP");
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

    //Print Adventurers starting values
    System.out.println(codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
    System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName());
    
    String move; int win = 2; //0 = CodeWarrior 1 = NeCromedian 2 = Quit/Tie
    game:
    while (codeWarrior.getHP() > 0 && neCromedian.getHP() > 0){
      //Code Warrior's turn
      while (true){
        System.out.println(codeWarrior.getName() + "'s turn");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        try{
          move = userInput.nextLine();
          if (move.toLowerCase().equals("attack") || move.equals("a")){
            codeWarrior.attack(neCromedian);
          }
          if (move.toLowerCase().equals("special") || move.equals("sp")){
            codeWarrior.specialAttack(neCromedian);
          }
          if (move.toLowerCase().equals("support") || move.equals("su")){
            codeWarrior.support();
          }
          if (move.toLowerCase().equals("quit")){
            win = 2;
            break game;
          }
          System.out.println(codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
          System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName());
          break;
        }
        catch (Exception ex){
          System.out.println("Bad input. Try again with one of the given words or shorthands.");
          continue;
        }
      }

      //NeCromedian's turn
      while (true){
        System.out.println(neCromedian.getName() + "'s turn");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        try{
          move = userInput.nextLine();
          if (move.toLowerCase().equals("attack") || move.equals("a")){
            neCromedian.attack(codeWarrior);
          }
          if (move.toLowerCase().equals("special") || move.equals("sp")){
            neCromedian.specialAttack(codeWarrior);
          }
          if (move.toLowerCase().equals("support") || move.equals("su")){
            neCromedian.support();
          }
          if (move.toLowerCase().equals("quit")){
            win = 2;
            break game;
          }
          System.out.println(codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
          System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName());
          break;
        }
        catch (Exception ex){
          System.out.println("Bad input. Try again with one of the given words or shorthands.");
          continue;
        }
      }
    }

    if (win == 0){
      System.out.println(codeWarrior.getName() + " the Code Warrior wins!");
    }
    if (win == 1){
      System.out.println(neCromedian.getName() + " the Ne-Cromedian wins!");
    }
    if (win == 2){
      System.out.println("No Contest");
    }

    userInput.close();
  }
}
