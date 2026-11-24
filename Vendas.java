import java.util.Scanner;
public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double totalGeral = 0;
        double maiorVenda = 0;

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Venda do dia " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();

                if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            double totalFuncionario = 0;

            for (int j = 0; j < 4; j++) {
                totalFuncionario += vendas[i][j];
            }

            System.out.println("Total do funcionário " + (i + 1) + ": R$ " + totalFuncionario);

            totalGeral += totalFuncionario;
        }

        System.out.println("Total geral: R$ " + totalGeral);
        System.out.println("Maior venda: R$ " + maiorVenda);

        sc.close();

}
}