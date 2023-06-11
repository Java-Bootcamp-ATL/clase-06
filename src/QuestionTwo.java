import java.util.Scanner;

public class QuestionTwo {
    public String SearchCelebrity () {
        Scanner scanner = new Scanner(System.in);
        String toSearch;
        String celebrity;
        System.out.print("Ingrese un nombre de tu personaje: ");
        celebrity = scanner.next();
        toSearch = String.format("https://twitter.com/search?q=%s", celebrity);
        System.out.println(toSearch);
        return toSearch;
    }
}
