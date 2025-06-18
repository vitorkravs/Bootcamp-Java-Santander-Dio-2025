import java.util.Scanner;

public class EstruturasControle {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        var name = scanner.next();
        System.out.println("Qual sua idade: ");
        var age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Você já é maior de idade!!");
        } else {
            System.out.printf("Olá %s, infelizmente você é menor de idade", name);
        };
    }
}
