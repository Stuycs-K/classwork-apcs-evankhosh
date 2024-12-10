public class NeCromedian extends Adventurer{
  private int special, specialMax;

  public NeCromedian(String name, int hp){
    super(name, hp);
    special = 50;
    specialMax = 100;
  }

  public NeCromedian(String name){
    this(name, 10);
  }

  public NeCromedian(){
    this("Jimmy");
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
  
  //heal or buff the target adventurer
  public String support(Adventurer other){
    other.setmaxHP((int)(other.getmaxHP() * 1.5));
    other.restoreSpecial(other.getSpecialMax() / 2);
    return "Increase maxHP to " + other.getSpecialMax() + " and restore " + other.getSpecialName() + " to " + other.getSpecial() + ".";
  }

  //heal or buff self
  public String support(){
    this.setmaxHP((int)(this.getmaxHP() * 1.5));
    this.restoreSpecial(this.getSpecialMax() / 2);
    return "Increase maxHP to " + this.getSpecialMax() + " and restore " + this.getSpecialName() + " to " + this.getSpecial() + ".";
  }
  
  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if(this.getSpecial() != 100){
      return "Not enough " + this.getSpecialName() + ".";
    }
    this.setSpecial(0);
    other.setHP(1);
    return "Reduce HP to " + other.getHP() + ".";
  }
}
