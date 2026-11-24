import java.util.Scanner;
public class Soma {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][2];
        double totalGeral = 0;

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota da disciplina " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        
        for (int i = 0; i < 3; i++) {
            double somaAluno = 0;

            for (int j = 0; j < 2; j++) {
                somaAluno += notas[i][j];
            }

            System.out.println("Soma das notas do aluno " + (i + 1) + ": " + somaAluno);

            totalGeral += somaAluno;
        }

        System.out.println("Total geral das notas: " + totalGeral);

        sc.close();

}
}
