
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int pessoas = entrada.nextInt();

        // Quantidade de alimentos em kg
        double carne = pessoas * 0.300;
        double linguica = pessoas * 0.200;
        double frango = pessoas * 0.150;

        // Preço de cada alimento
        double custoCarne = carne * 50.00;
        double custoLinguica = linguica * 28.00;
        double custoFrango = frango * 22.00;

        // Custo total
        double custoTotal = custoCarne + custoLinguica + custoFrango;

        // Valor por pessoa
        double valorPessoa = custoTotal / pessoas;

        System.out.println("\nQuantidades:");
        System.out.printf("Carne: %.1f kg - Linguiça: %.1f kg - Frango: %.1f kg%n",
                carne, linguica, frango);

        System.out.println("\nCusto total:");
        System.out.printf("Carne: R$ %.2f - Linguiça: R$ %.2f - Frango: R$ %.2f%n",
                custoCarne, custoLinguica, custoFrango);

        System.out.printf("%nCusto total do churrasco: R$ %.2f%n", custoTotal);
        System.out.printf("Cada pessoa deve contribuir com: R$ %.2f%n", valorPessoa);

        entrada.close();
    }
}
