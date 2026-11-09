import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // Define o locale como US para aceitar ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Nome do livro: ");
        String livro = scanner.nextLine();

        System.out.print("Total de páginas: ");
        int paginas = scanner.nextInt();

        System.out.print("Tempo por página (segundos): ");
        double segundosPorPagina = scanner.nextDouble();

        // Cálculo do tempo total em horas: (páginas * segundos) / 3600
        double tempoHoras = (paginas * segundosPorPagina) / 3600.0;

        System.out.printf(Locale.US, "%s, você finalizará a leitura do livro %s em aproximadamente %.2f horas.%n",
                nome, livro, tempoHoras);

        scanner.close();
    }
}