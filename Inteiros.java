import java.util.Scanner;

public class Inteiros{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] auxiliar = new int[10];
        int quantidade = 0;

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            boolean repetido = false;

            for (int j = 0; j < quantidade; j++) {
                if (vetor[i] == auxiliar[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                auxiliar[quantidade] = vetor[i];
                quantidade++;
            }
        }

      
        int[] novoVetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            novoVetor[i] = auxiliar[i];
        }

    
        System.out.print("\nVetor original: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nNovo vetor: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(novoVetor[i] + " ");
        }

        System.out.println("\nValores removidos: " + (10 - quantidade));

        entrada.close();
    }
}
