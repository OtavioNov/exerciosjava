public class Primos {
public static void main(String[] args) {
   
    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int[] filtrarPrimos(int[] v) {
        int contador = 0;

        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                contador++;
            }
        }

        int[] primos = new int[contador];
        int posicao = 0;

        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                primos[posicao] = v[i];
                posicao++;
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numeros[i] = sc.nextInt();
        }

        
        int[] resultado = filtrarPrimos(numeros);

        /
        System.out.println("Numeros primos:");

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        sc.close();
    }
}
}

