
import java.util.Scanner;

public class Media{



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            soma += notas[i];

            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / 5;

        System.out.println("\nMedia da turma: " + media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
    }
}