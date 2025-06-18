import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número de sua preferência: ");
        var num = scanner.nextInt();

        System.out.printf("Lista de números: \n");
        for (var i = 0 ; i <= num ; i++ ) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
