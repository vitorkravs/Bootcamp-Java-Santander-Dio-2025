import java.util.Scanner;

public class ExecicioCalculoImc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        if(peso > 0 && altura > 0) {
            double calculo = peso / (altura * altura);
            System.out.printf("Seu IMC é: %s \n", calculo);

            int categoria;

            if (calculo < 18.5) {
                categoria = 1;
            } else if (calculo < 24.9) {
                categoria = 2;
            } else if (calculo < 29.9) {
                categoria = 3;
            } else if (calculo < 34.9) {
                categoria = 4;
            } else if (calculo < 39.9) {
                categoria = 5;
            } else {
                categoria = 6;
            }
            switch (categoria) {
                case 1:
                    System.out.println("Abaixo do peso");
                    break;
                case 2:
                    System.out.println("Peso ideal");
                    break;
                case 3:
                    System.out.println("Levemente acima do peso");
                    break;
                case 4:
                    System.out.println("Obesidade grau I");
                    break;
                case 5:
                    System.out.println("Obesidade grau II (devera)");
                    break;
                case 6:
                    System.out.println("Obesidade grau III (mórbida)");
                    break;
                default:
                    System.out.println("Categoria desconhecida");
                    break;
            }
        }
    }
}
