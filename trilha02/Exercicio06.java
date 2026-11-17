
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cor1 = entrada.nextLine();
        String cor2 = entrada.nextLine();

        if (cor1.equalsIgnoreCase("Vermelho")
                && cor2.equalsIgnoreCase("Azul")
                || cor1.equalsIgnoreCase("Azul")
                && cor2.equalsIgnoreCase("Vermelho")) {

            System.out.println("A combinação resulta em:");
            System.out.println("Roxo");

        } else if (cor1.equalsIgnoreCase("Vermelho")
                && cor2.equalsIgnoreCase("Amarelo")
                || cor1.equalsIgnoreCase("Amarelo")
                && cor2.equalsIgnoreCase("Vermelho")) {

            System.out.println("A combinação resulta em:");
            System.out.println("Laranja");

        } else if (cor1.equalsIgnoreCase("Azul")
                && cor2.equalsIgnoreCase("Amarelo")
                || cor1.equalsIgnoreCase("Amarelo")
                && cor2.equalsIgnoreCase("Azul")) {

            System.out.println("A combinação resulta em:");
            System.out.println("Verde");

        } else {
            System.out.println("Apenas cores primárias são aceitas.");
        }

        entrada.close();
    }
}

