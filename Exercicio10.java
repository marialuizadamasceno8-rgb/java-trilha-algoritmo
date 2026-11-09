import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Descrição da meta: ");
        String meta = scanner.nextLine();

        System.out.print("Valor necessário (R$): ");
        double valorMeta = scanner.nextDouble();

        System.out.print("Salário mensal (R$): ");
        double salario = scanner.nextDouble();

        System.out.print("Despesas mensais (R$): ");
        double despesas = scanner.nextDouble();

        double saldoAposDespesas = salario - despesas;
        double reservaFixa = saldoAposDespesas * 0.30;
        double valorDisponivel = saldoAposDespesas - reservaFixa;
        double prazoMeses = valorMeta / valorDisponivel;

        System.out.printf(Locale.US, "Meta: %s (R$ %.2f)%n", meta, valorMeta);
        System.out.printf(Locale.US, "Salário: R$ %.2f - Despesas: R$ %.2f%n", salario, despesas);
        System.out.printf(Locale.US, "Saldo após despesas: R$ %.2f Reserva fixa (30%%): R$ %.2f%n", saldoAposDespesas, reservaFixa);
        System.out.printf(Locale.US, "Valor disponível para a meta: R$ %.2f por mês%n", valorDisponivel);
        System.out.printf(Locale.US, "Prazo estimado para atingir a meta: %.2f meses%n", prazoMeses);

        scanner.close();
    }
}