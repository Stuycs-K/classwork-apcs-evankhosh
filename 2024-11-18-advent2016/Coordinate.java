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

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
  
  public void change(char dir){
    if (dir == 'U' && y > 0){ y--; }
    if (dir == 'R' && x < 2){ x++; }
    if (dir == 'D' && y < 2){ y++; }
    if (dir == 'L' && x > 0){ x--; }
    return;
  }

  public void changeDia(char dir){
    int yLeeway = 2 - (x % 2); int xLeeway = 2 - (y % 2);
    if (x == 2) { yLeeway = 0; }
    if (y == 2) { xLeeway = 0; }
    if (dir == 'U' && y > yLeeway){ y--; }
    if (dir == 'R' && x < 4 - xLeeway){ x++; }
    if (dir == 'D' && y < 4 - yLeeway){ y++; }
    if (dir == 'L' && x > xLeeway){ x--; }
    return;
  }

  public int numPad(){
    if (x == 0 && y == 0) { return 1; }
    else if (x == 1 && y == 0) { return 2; }
    else if (x == 2 && y == 0) { return 3; }
    else if (x == 0 && y == 1) { return 4; }
    else if (x == 1 && y == 1) { return 5; }
    else if (x == 2 && y == 1) { return 6; }
    else if (x == 0 && y == 2) { return 7; }
    else if (x == 1 && y == 2) { return 8; }
    else { return 9; }
  }

  public char diaPad(){
    if (y == 0) { return '1'; }
    else if (y == 1) {
      if (x == 1) { return '2'; }
      else if (x == 2) { return '3'; }
      else { return '4'; }
    }
    else if (y == 2) {
      if (x == 0) { return '5'; }
      else if (x == 1) { return '6'; }
      else if (x == 2) { return '7'; }
      else if (x == 3) { return '8'; }
      else { return '9'; }
    }
    else if (y == 3) {
      if (x == 1) { return 'A'; }
      else if (x == 2) { return 'B'; }
      else { return 'C'; }
    }
    else { return 'D'; }
  }

  public boolean equals(Coordinate other){
    return this.x == other.x && this.y == other.y;
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
