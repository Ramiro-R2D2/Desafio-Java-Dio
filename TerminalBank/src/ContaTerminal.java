import java.util.Locale;
import java.util.Scanner;
import Models.*;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Hi, I'm your terminal banking app. Please enter your branch !");
        String Branch = scanner.next();
        System.out.println("Hi, I'm your terminal banking app. Please enter your account number !");
        int NumberClient = scanner.nextInt();
        System.out.println("Hi, I'm your terminal banking app. Please enter your balance !");
        Float Balance = scanner.nextFloat();
        System.out.println("Hi, I'm your terminal banking app. Please enter your name !");
        String NameClienteBank = scanner.next();
        ClienteBanco cliente = new ClienteBanco(NumberClient, Branch, Balance, NameClienteBank);
        BankSystem BankS = new BankSystem(cliente);
        System.out.println(BankS.Notification()); 
        scanner.close();
    }
}

