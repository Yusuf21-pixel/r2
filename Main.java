import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    int r1 = kbd.nextInt();
    int s = kbd.nextInt();
    int r2 = 2 * s - r1;
    System.out.println(r2);
  }
}