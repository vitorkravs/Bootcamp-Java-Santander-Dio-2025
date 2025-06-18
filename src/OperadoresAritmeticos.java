import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        var numUm = scanner.nextInt();
        System.out.println("Digite mais um número:");
        var numDois = scanner.nextInt();
        System.out.printf(numUm + " + " + numDois + " = " + numUm + numDois + " jeito errado!! está concatenando!! \n");
        System.out.printf("%s - %s = %s", numUm, numDois, numUm - numDois + "\n");
        System.out.printf("%s + %s = %s", numUm, numDois, numUm + numDois + "\n");
        System.out.printf("%s / %s = %s", numUm, numDois, numUm / numDois + "\n");
        System.out.printf("%s * %s = %s", numUm, numDois, numUm * numDois + "\n");
    }

}
