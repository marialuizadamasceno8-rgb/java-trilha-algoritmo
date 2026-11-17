
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ganhos = entrada.nextDouble();
        double gastos = entrada.nextDouble();

        if (ganhos >= gastos) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Você está fora do orçamento!");
            System.out.println("Não gaste mais!");
        }

        entrada.close();
    }
}
