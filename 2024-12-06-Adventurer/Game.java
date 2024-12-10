import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    CodeWarrior codeWarrior; String codeWarriorInput; String[] codeWarriorInputArr;
    NeCromedian neCromedian; String neCromedianInput; String[] neCromedianInputArr;

    //Set up CodeWarrior
    while (true){
      System.out.println("Enter your Code Warrior's Name, HP, and Coding Language\n");
      codeWarriorInput = userInput.nextLine();
      codeWarriorInputArr = codeWarriorInput.split(" ");
      try{
        if (codeWarriorInputArr.length == 1 && codeWarriorInputArr[0].equals("")) { codeWarrior = new CodeWarrior(); }
        else if (codeWarriorInputArr.length == 1) { codeWarrior = new CodeWarrior(codeWarriorInputArr[0]); }
        else if (codeWarriorInputArr.length == 2) { codeWarrior = new CodeWarrior(codeWarriorInputArr[0], Integer.parseInt(codeWarriorInputArr[1])); }
        else if (codeWarriorInputArr.length == 3) { codeWarrior = new CodeWarrior(codeWarriorInputArr[0], Integer.parseInt(codeWarriorInputArr[1]), codeWarriorInputArr[2]); }
        else { throw new Exception("bad"); }
        System.out.print("\n");
        break;
      }
      catch (Exception ex){
        System.out.println("\nBad input. Try again with the format: \"Name HP(numbers only) Language\".\n");
        continue;
      }
    }

    //Set up NeCromedian
    while (true){
      System.out.println("Enter your Ne-Cromedian's Name and HP\n");
      neCromedianInput = userInput.nextLine();
      neCromedianInputArr = neCromedianInput.split(" ");
      try{
        if (neCromedianInputArr.length == 1 && neCromedianInputArr[0].equals("")) { neCromedian = new NeCromedian(); }
        else if (neCromedianInputArr.length == 1) { neCromedian = new NeCromedian(neCromedianInputArr[0]); }
        else if (neCromedianInputArr.length == 2) { neCromedian = new NeCromedian(neCromedianInputArr[0], Integer.parseInt(neCromedianInputArr[1])); }
        else { throw new Exception("bad"); }
        System.out.print("\n");
        break;
      }
      catch (Exception ex){
        System.out.println("\nBad input. Try again with the format: \"Name HP(numbers only)\".\n");
        continue;
      }
    }

    //Print Adventurers' starting values
    System.out.println(codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
    System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName() + "\n");
    
    String move; int win = 2; //0 = CodeWarrior 1 = NeCromedian 2 = Quit/Tie
    game:
    while (codeWarrior.getHP() > 0 && neCromedian.getHP() > 0){
      //Code Warrior's turn
      while (true){
        System.out.println(codeWarrior.getName() + "'s turn");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit\n");
        try{
          move = userInput.nextLine();
          win = 0;
          if (move.toLowerCase().equals("attack") || move.equals("a")){
            System.out.println("\n" + codeWarrior.attack(neCromedian));
          }
          if (move.toLowerCase().equals("special") || move.equals("sp")){
            System.out.println("\n" + codeWarrior.specialAttack(neCromedian));
          }
          if (move.toLowerCase().equals("support") || move.equals("su")){
            System.out.println("\n" + codeWarrior.support());
          }
          if (move.toLowerCase().equals("quit")){
            win = 2;
            System.out.print("\n");
            break game;
          }
          System.out.println("\n" + codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
          System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName() + "\n");
          break;
        }
        catch (Exception ex){
          System.out.println("\nBad input. Try again with one of the given words or shorthands.\n");
          continue;
        }
      }

      //NeCromedian's turn
      while (true){
        System.out.println(neCromedian.getName() + "'s turn");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit\n");
        try{
          move = userInput.nextLine();
          win = 1;
          if (move.toLowerCase().equals("attack") || move.equals("a")){
            System.out.println("\n" + neCromedian.attack(codeWarrior));
          }
          if (move.toLowerCase().equals("special") || move.equals("sp")){
            System.out.println("\n" + neCromedian.specialAttack(codeWarrior));
          }
          if (move.toLowerCase().equals("support") || move.equals("su")){
            System.out.println("\n" + neCromedian.support());
          }
          if (move.toLowerCase().equals("quit")){
            win = 2;
            System.out.print("\n");
            break game;
          }
          System.out.println("\n" + codeWarrior.getName() + ", " + codeWarrior.getHP() + "/" + codeWarrior.getmaxHP() + " HP, " + codeWarrior.getSpecial() + "/" + codeWarrior.getSpecialMax() + " " + codeWarrior.getSpecialName());
          System.out.println(neCromedian.getName() + ", " + neCromedian.getHP() + "/" + neCromedian.getmaxHP() + " HP, " + neCromedian.getSpecial() + "/" + neCromedian.getSpecialMax() + " " + neCromedian.getSpecialName() + "\n");
          break;
        }
        catch (Exception ex){
          System.out.println("\nBad input. Try again with one of the given words or shorthands.\n");
          continue;
        }
      }
    }

    //Winning or Tying
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
