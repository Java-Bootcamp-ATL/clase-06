import java.util.Scanner;

public class QuestionSeven {
  public void highAndLowNumber () {
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int num = 100;
    System.out.println("Imprimiendo los 100 primeros numeros:");

    while (count <= num){
      System.out.println("Numero: " + count++);
    };

  }
}
