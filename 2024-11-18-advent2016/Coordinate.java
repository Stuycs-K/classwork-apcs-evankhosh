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
    if (dir == 'R' && x != 2){ x++; }
    if (dir == 'D' && y != 2){ y++; }
    if (dir == 'L' && x != 0){ x--; }
    return;
  }

  public int numPad(){
    if (x == 0 && y == 0) { return 1; }
    else if (x == 0 && y == 1) { return 2; }
    else if (x == 0 && y == 2) { return 3; }
    else if (x == 1 && y == 0) { return 4; }
    else if (x == 1 && y == 1) { return 5; }
    else if (x == 1 && y == 2) { return 6; }
    else if (x == 2 && y == 0) { return 7; }
    else if (x == 2 && y == 1) { return 8; }
    else { return 9; }
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
