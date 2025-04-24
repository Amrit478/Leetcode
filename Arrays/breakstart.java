/*I am just going to write some logic for arrays because i have not study for past 2 days*/

public class Main {
  public static void main(String[] args) {
    int[] amrit = new int[10];
    int i = 0;

    amrit[0] = 12;
    amrit[1] = 1;
    amrit[2] = 2;
    amrit[3] = 3;
    amrit[4] = 4;
    amrit[5] = 5;
    amrit[6] = 6;
    amrit[7] = 7;

    // Now printing the non-zero (initialized) values of the array
    while (i < amrit.length && amrit[i] != 0) {
      System.out.println(amrit[i]);
      i++;
    }
  }
}
