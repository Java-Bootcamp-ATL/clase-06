import java.util.Random;
import java.util.Scanner;

public class QuestionEight {
  public void rockScissorPaper () {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int optionSelect;
    String rock = "piedra";
    String paper = "papel";
    String scissor = "tijera";
    String[] words = {"piedra", "papel", "tijera"};
    int randomIndex = random.nextInt(words.length );

    System.out.println("Jugaras Piedra, Papel, Tijera contra la maquina...");
    System.out.println("Escoja una opcion: ");
    System.out.println("1) Piedra ");
    System.out.println("2) Papel ");
    System.out.println("3) Tijera ");
    System.out.print("Escriba un numero del 1 - 3: ");
    optionSelect = scanner.nextInt();

    String machineRandom = words[randomIndex];

    switch (optionSelect){
      case 1:
        if (machineRandom.equals(rock)){
          System.out.println("Empates");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + rock);
        }else if (machineRandom.equals(paper)){
          System.out.println("Gano la maquina!!");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + rock);
        } else if (machineRandom.equals(scissor)){
          System.out.println("Gano usted");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + rock);
        }
        break;
      case 2:
        if (machineRandom.equals(paper)){
          System.out.println("Empates");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + paper);
        }else if (machineRandom.equals(scissor)){
          System.out.println("Gano la maquina!!");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + paper);
        } else if (machineRandom.equals(rock)){
          System.out.println("Gano usted");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + paper);
        }
        break;
      case 3:
        if (machineRandom.equals(scissor)){
          System.out.println("Empates");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + scissor);
        }else if (machineRandom.equals(rock)){
          System.out.println("Gano la maquina!!");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + scissor);
        } else if (machineRandom.equals(paper)){
          System.out.println("Gano usted");
          System.out.println("Maquina: " + machineRandom);
          System.out.println("Tu: " + scissor);
        }
        break;
    }
  }
}
