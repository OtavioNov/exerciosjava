import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dias = {
            "Domingo", "Segunda", "Terça",
            "Quarta", "Quinta", "Sexta", "Sábado"
        };

        double[] temperaturas = new double[7];
        double soma = 0;
        double maior;


        for (int i = 0; i < 7; i++) {
            System.out.print("Temperatura de " + dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        
        double media = soma / 7;

        
        maior = temperaturas[0];
        int diaQuente = 0;

        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                diaQuente = i;
            }
        }
        System.out.println("\nMédia da semana: " + media);

        System.out.println("\nDias acima da média:");
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > media) {
                System.out.println(dias[i] + ": " + temperaturas[i] + "°C");
            }
        }

        System.out.println("\nDia mais quente: " + dias[diaQuente]);
        System.out.println("Temperatura: " + maior + "°C");

        sc.close();
    }
}


