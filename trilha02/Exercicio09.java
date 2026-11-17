
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String curso = entrada.nextLine();
        String isento = entrada.nextLine();
        double desconto = entrada.nextDouble();

        double mensalidade;

        switch (curso.toUpperCase()) {
            case "SI":
                mensalidade = 900.00;
                break;

            case "ADS":
                mensalidade = 750.00;
                break;

            case "CS":
                mensalidade = 1150.00;
                break;

            case "EC":
                mensalidade = 1300.00;
                break;

            case "ES":
                mensalidade = 950.00;
                break;

            default:
                System.out.println("Curso não encontrado");
                entrada.close();
                return;
        }

        if (isento.equalsIgnoreCase("Sim")) {
            mensalidade = 0;
        } else {
            mensalidade = mensalidade - (mensalidade * desconto / 100);
        }

        System.out.printf("Valor da mensalidade:%nR$ %.2f%n",
                mensalidade);

        entrada.close();
    }
}
