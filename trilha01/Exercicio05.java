
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double desconto = entrada.nextDouble();

        double valorDesconto = valorCompra * desconto / 100;

        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("%nOlá %s, sua compra de R$ %.2f foi confirmada!%n",
                nome, valorCompra);

        System.out.printf("Foi aplicado um desconto de %.1f%%.%n", desconto);

        System.out.printf("O total final ficou em R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
