import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       float valor_por_hora, salario;
       int horas_trabalhadas;
       Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Qual o valor você ganha por hora: ");
      valor_por_hora = teclado.nextFloat();

      System.out.println("Quantas horas você trabalhou neste mês? ");
      horas_trabalhadas = teclado.nextInt();
       //Process
       salario = (horas_trabalhadas * valor_por_hora);
       
       //Output
       System.out.println("Neste mês você vai receber R$ "+ salario);
       teclado.close();
       

    }
}