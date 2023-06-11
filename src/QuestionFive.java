import java.util.Scanner;

public class QuestionFive {
  public void averageNumbers () {
    Scanner scanner = new Scanner(System.in);
    float num1, num2, num3;
    float average;
    System.out.print("Ingrese el primer numero: ");
    num1 = scanner.nextFloat();
    System.out.print("Ingrese el segundo numero: ");
    num2 = scanner.nextFloat();
    System.out.print("Ingrese el tercer numero: ");
    num3 = scanner.nextFloat();

    average = (num1 + num2 + num3) / 3;

    System.out.print("El promedio de los tres numeros es: " + average);
  }
}
