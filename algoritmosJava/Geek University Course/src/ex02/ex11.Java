import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int c;
       float n, e = 0, salario, valor_hora = (float) 10.00;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe o código: ");
       c = teclado.nextInt();
       System.out.println("Informe a quantidade de horas trabalhadas: ");
       n = teclado.nextFloat();

       //Process
       if(n > 50) {
        e = (float)(n - 50) * (float)20.00;
        salario = (50 * valor_hora) + e;
        System.out.printf("Salário Total R$\n" + salario);
        System.out.printf("Salário excedente R$\n" + e);
       } else {
        salario = n * valor_hora;
         System.out.printf("Salário Total R$\n" + salario);
        System.out.printf("Salário excedente R$\n" + e);
       }
       teclado.close();
       //Output
       

    }
}