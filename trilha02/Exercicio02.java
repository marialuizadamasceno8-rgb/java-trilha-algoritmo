
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cor = entrada.nextLine();

        if (cor.equalsIgnoreCase("Vermelho")) {
            System.out.println("Espere");
        } else if (cor.equalsIgnoreCase("Verde")) {
            System.out.println("Atravesse");
        } else {
            System.out.println("Farol inoperante");
        }

        entrada.close();
    }
}
