import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?: ");
        var age = scanner.nextInt();
        System.out.println("Voce possui carta?");
        var possuiCarta = scanner.next();
        var resultCarta = possuiCarta.equals("sim") || possuiCarta.equals("s") || possuiCarta.equals("true");
        var result = age >= 18;
        System.out.printf("Você já é maior de idade: (%s), e possui um carro: (%s)", result, resultCarta);
    }

}
