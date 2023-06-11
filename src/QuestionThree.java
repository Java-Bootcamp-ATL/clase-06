import java.util.Scanner;

public class QuestionThree {
    public String callByWhatsapp () {
        Scanner scanner = new Scanner(System.in);
        String toCall;
        int phone;
        System.out.print("Ingrese un numero de celular por whatsapp: ");
        phone = scanner.nextInt();
        toCall = String.format("https://api.whatsapp.com/send?phone=%d", phone);
        System.out.println(toCall);
        return toCall;
    }
}
