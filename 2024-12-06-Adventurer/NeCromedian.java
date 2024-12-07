public class NeCromedian extends Adventurer{
  private int special, specialMax;
  
  public NeCromedian(String name){
    super(name, 10);
    special = 50;
    specialMax = 100;
  }

  public NeCromedian(String name, int hp){
    super(name, hp);
    special = 50;
    specialMax = 100;
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Bad Jokes";
  }

  //accessor methods
  public int getSpecial(){
    return special;
  }
  public void setSpecial(int n){
    special = n;
  }
  public int getSpecialMax(){
    return specialMax;
  }
  
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(1);
    return "Reduce HP to " + other.getHP() + ".";
  }
}
