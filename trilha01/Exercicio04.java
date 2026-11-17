
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorReal = entrada.nextDouble();

        double cotacaoDolar = 5.42;

        double valorDolar = valorReal / cotacaoDolar;

        System.out.printf("Valor em real R$ %.0f.%n", valorReal);
        System.out.printf("Valor em dólar $ %.2f.%n", valorDolar);

        entrada.close();
    }
}
