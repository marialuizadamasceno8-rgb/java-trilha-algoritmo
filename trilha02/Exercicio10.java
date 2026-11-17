
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int inteiras = entrada.nextInt();
        int meias = entrada.nextInt();
        entrada.nextLine();

        String dia = entrada.nextLine();
        String nacional = entrada.nextLine();

        double total;

        if (nacional.equalsIgnoreCase("Sim")) {
            total = (inteiras + meias) * 5.00;

        } else if (dia.equalsIgnoreCase("Quarta-feira")) {
            total = (inteiras + meias) * 14.50;

        } else {
            total = (inteiras * 28.50) + (meias * 14.25);
        }

        System.out.printf("Total à pagar:%nR$ %.2f%n", total);

        entrada.close();
    }
}
