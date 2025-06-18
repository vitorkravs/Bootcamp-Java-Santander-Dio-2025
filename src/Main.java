import java.util.Scanner;

public class Main {
    private final  static  String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello World! \n");
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Ola %s sua idade é %s", name, age);
    }
}