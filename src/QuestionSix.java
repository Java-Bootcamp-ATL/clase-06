import java.util.Scanner;

public class QuestionSix {
  public void highAndLowNumber () {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, num3;
    System.out.print("Ingrese el primer numero: ");
    num1 = scanner.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2 = scanner.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = scanner.nextInt();

    if (num1 > num2 && num1 > num3){
      System.out.println("El numero mayor es: " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("El numero mayor es: " + num2);
    }else if (num3 > num1 && num3 > num2) {
      System.out.println("El numero mayor es: " + num3);
    }

    if (num1 < num2 && num1 < num3){
      System.out.println("El numero menor es: " + num1);
    } else if (num2 < num1 && num2 < num3) {
      System.out.println("El numero menor es: " + num2);
    }else if (num3 < num1 && num3 < num2) {
      System.out.println("El numero menor es: " + num3);
    }

  }
}
