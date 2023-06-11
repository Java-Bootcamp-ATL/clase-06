import java.util.Scanner;

public class QuestionFour {
  public void makeHistory () {
    Scanner scanner = new Scanner(System.in);
    int optionOne;
    String textBegin = "";
    System.out.print("Haremos un cuento y para ello usted lo construira escogiendo las opciones que se le mostrara....");
    System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
    System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante ");
    System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora ");
    System.out.print("Ingresa una opcion: ");
    optionOne = scanner.nextInt();
    firstStep(optionOne);
    if (optionOne == 2){
      int optionTwo;
      System.out.println("1) Entras por la puerta de la izquierda ");
      System.out.println("2) Optas por la puerta de la derecha ");
      System.out.print("Ingresa una opcion: ");
      optionTwo = scanner.nextInt();
      secondStep(optionTwo);
    } else if (optionOne == 1){
      int optionTwo;
      System.out.println("1) Entras por la puerta de la izquierda ");
      System.out.println("2) Optas por la puerta de la derecha ");
      System.out.print("Ingresa una opcion: ");
      optionTwo = scanner.nextInt();
      secondStep(optionTwo);
    }
  }

  public void firstStep (int option) {
    switch (option){
      case 1:
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso y ");
        System.out.println("decider explorar la oscuridad en busca de la fuente del deseo, sin embargo escuchas un susurro escalofriante y ves dos puerdas: ");
        break;
      case 2:
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso y ");
        System.out.println("decides seguir el sendero iluminado hacia una pequeña cabaña acogedora.");
        System.out.println("Al llegar a la cabaña, te das cuenta de que hay dos puertas: ");
        break;
    }
  }
  public void secondStep (int option) {
      String optionOne = "Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!";
      String optionTwo = "Al abrir la puerta de la derecha, descubres que todo es un sueño!";
    switch (option){
      case 1:
        System.out.println("Entonces " + optionOne);
        break;
      case 2:
        System.out.println("entonces " + optionTwo);
        break;
    }
  }
}
