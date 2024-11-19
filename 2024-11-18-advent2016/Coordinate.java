public class Coordinate{
  private int x;
  private int y;

  public Coordinate(int x, int y){
    this.x = x;
    this. y = y;
  }

  public Coordinate(Coordinate other){
    this.x = other.x;
    this.y = other.y;
  }

  public void change(char dir){
    if (dir == 'U' && y != 0){ y--; }
    if (dir == 'R' && x != 3){ x++; }
    if (dir == 'D' && y != 3){ y++; }
    if (dir == 'L' && x != 0){ x--; }
    return;
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
