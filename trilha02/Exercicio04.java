
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double gramas = entrada.nextDouble();

        if (gramas <= 0) {
            System.out.println("Peso inválido");
        } else {
            double preco;

            if (gramas >= 1000) {
                preco = 3.00;
            } else {
                preco = 3.50;
            }

            double total = (gramas / 100) * preco;

            System.out.printf("O total é R$ %.2f%n", total);
        }

        entrada.close();
    }
}

