import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int[] D = new int[10];

       
        System.out.println("Digite os 5 valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = entrada.nextInt();
        }

       
        System.out.println("Digite os 5 valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

       
        for (int i = 0; i < 5; i++) {
            D[i * 2] = A[i];
            D[i * 2 + 1] = B[i];
        }

       
        System.out.print("\nVetor A: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

       
        System.out.print("\nVetor B: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        
        System.out.print("\nVetor C (soma): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

       
        System.out.print("\nVetor D (intercalado): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(D[i] + " ");
        }

        entrada.close();
    }
}