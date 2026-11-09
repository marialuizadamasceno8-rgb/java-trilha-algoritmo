import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade Açaí P: ");
        int qtdP = scanner.nextInt();

        System.out.print("Quantidade Açaí M: ");
        int qtdM = scanner.nextInt();

        System.out.print("Quantidade Açaí G: ");
        int qtdG = scanner.nextInt();

        System.out.print("Desconto (%): ");
        double porcentagemDesconto = scanner.nextDouble();

        // Valores unitários: P = 13.50, M = 15.00, G = 17.50
        double subtotal = (qtdP * 13.50) + (qtdM * 15.00) + (qtdG * 17.50);
        double valorDesconto = subtotal * (porcentagemDesconto / 100.0);
        double total = subtotal - valorDesconto;

        System.out.println("Seu pedido foi registrado.");
        System.out.println("-Açaí P: " + qtdP);
        System.out.println("-Açaí M: " + qtdM);
        System.out.println("-Açaí G: " + qtdG);
        System.out.printf(Locale.US, "Desconto de %.0f%% aplicado.%n", porcentagemDesconto);
        System.out.printf(Locale.US, "Total R$ %.2f%n", total);

        scanner.close();
    }
}