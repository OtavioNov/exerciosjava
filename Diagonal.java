import java.util.Scanner;
public class Diagonal {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma1 = 0;
        int soma2 = 0;

        // Ler a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar a matriz como tabela
        System.out.println("\nMatriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Somar as diagonais
        for (int i = 0; i < 4; i++) {
            soma1 += matriz[i][i];
            soma2 += matriz[i][3 - i];
        }

        System.out.println("\nSoma da diagonal principal: " + soma1);
        System.out.println("Soma da diagonal secundaria: " + soma2);

        sc.close();
    }
}

