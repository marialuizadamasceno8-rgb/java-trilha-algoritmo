
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notaCandidato = entrada.nextDouble();
        double notaCorte = entrada.nextDouble();
        double notaMinima = entrada.nextDouble();

        System.out.println("Situação candidato:");

        if (notaCandidato < notaCorte) {
            System.out.println("Reprovado");
        } else if (notaCandidato >= notaMinima) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Lista de Espera");
        }

        entrada.close();
    }
}
