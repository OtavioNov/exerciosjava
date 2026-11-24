public class TotalVendas {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double maiorTotal = 0;
        int diaMaiorVenda = 0;

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Venda do dia " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();
            }
        }

    
        for (int j = 0; j < 4; j++) {
            double totalDia = 0;

            for (int i = 0; i < 3; i++) {
                totalDia += vendas[i][j];
            }

            System.out.println("Total vendido no dia " + (j + 1) + ": R$ " + totalDia);

            if (j == 0 || totalDia > maiorTotal) {
                maiorTotal = totalDia;
                diaMaiorVenda = j + 1;
            }
        }

        System.out.println("Dia com maior venda: " + diaMaiorVenda);
        System.out.println("Maior total vendido: R$ " + maiorTotal);

        sc.close();
    }

}
}
