import java.util.Scanner;

public class ExercicioEstruturaRepeticao {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        System.out.println("Digite um número: ");
        var num = scanner.nextInt();
        var i = 1;
        while(i <= 10) {
            if(num <= 0) {
                System.out.println("O número deve ser maior que 0");
                break;
            }
            System.out.printf("%s * %s = %s \n", num, i, num * i);
            i++;
        }
    }
}
