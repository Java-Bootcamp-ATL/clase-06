import java.util.Scanner;

public class QuestionOne {
    public String SearchCountry () {
        Scanner scanner = new Scanner(System.in);
        String toSearch;
        String country;
        System.out.print("Ingrese un nombre de pais: ");
        country = scanner.next();
        toSearch = String.format("https://www.google.com/maps/search/%s", country);
        System.out.println(toSearch);
        return toSearch;
    }
}
