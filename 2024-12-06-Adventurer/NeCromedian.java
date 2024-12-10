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
    return this + " attacked "+ other + " and dealt 1 point of damage. They then take crack a bad joke.";
  }
  
  //heal or buff the target adventurer
  public String support(Adventurer other){
    other.setmaxHP((int)(other.getmaxHP() * 1.5));
    return this + "makes " + other + " laugh with a couple bad jokes and restores " + other.restoreSpecial(other.getSpecialMax() / 2) + " " + other.getSpecialName() + "and increases max HP to " + other.getmaxHP();
  }

  //heal or buff self
  public String support(){
    this.setmaxHP((int)(this.getmaxHP() * 1.5));
    return this + "cracks a few bad jokes to himself and restores " + this.restoreSpecial(this.getSpecialMax() / 2) + " " + this.getSpecialName() + "and increases max HP to " + this.getmaxHP();
  }
  
  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if(this.getSpecial() != 100){
      return "Not enough " + this.getSpecialName() + " to give a stand-up routine. Instead " + attack(other);
    }
    this.setSpecial(0);
    other.setHP(1);
    return this + " used their " + this.getSpecialName() + " to start a ghoulish stand-up routine. This cracks up " + other + " setting their health to 1.";
  }
}
