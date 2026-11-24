import java.util.Scanner;
public class Calculadora {

    public static double divisao(double num1 , double num2) {
        return num1 / num2;
    }
  public static double mult(double num1, double num2) {
        return  num1 * num2;
    
  }
  
    public static double subtracao(double num1, double num2){
        return num1 - num2;

   }  
   public static double soma(double num1 , double num2) {
        return   num1 + num2;
    
   }
      
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
      
 System.out.println("Digite o primeiro numero: ");
          double num1 = scanner.nextDouble();
      
          System.out.println("Digite o segundo numero: ");
          double num2 = scanner.nextDouble();
       
System.out.println("soma: "  + soma(num1,num2)     );
System.out.println("subtracao" + subtracao(num1,num2));
System.out.println("multplicacao" + mult(num1,num2));
System.out.println("divisao" + divisao(num1,num2));
        
if (num2 == 0) {
    System.out.println("Não é posivel dividir por 0 ");
    
} else {
    System.out.println("divisao" + divisao(num1,num2));
        
}

    }



}
