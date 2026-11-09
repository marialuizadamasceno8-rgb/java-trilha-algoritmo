import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Tamanho da pista (m): ");
        double tamanhoPista = scanner.nextDouble();

        System.out.print("Quantidade de voltas: ");
        int voltas = scanner.nextInt();

        System.out.print("Tempo da 1ª volta (s): ");
        double tempoVolta = scanner.nextDouble();

        // Conversão de metros para km e de segundos para minutos
        double distanciaKm = (tamanhoPista * voltas) / 1000.0;
        double tempoMinutos = (voltas * tempoVolta) / 60.0;

        System.out.println("Análise Preditiva Concluída");
        System.out.println("--");
        System.out.printf(Locale.US, "Distância total a ser percorrida: %.2f km. Previsão de conclusão: %.1f minutos.%n",
                distanciaKm, tempoMinutos);

        scanner.close();
    }
}