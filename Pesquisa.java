import java.util.Scanner;

public class Pesquisa {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nNúmeros digitados:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nQuantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Soma de todos os números: " + soma);

        sc.close();
    }
}
