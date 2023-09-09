import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int num1, num2, soma;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe o primeiro número: ");
       num1 = teclado.nextInt();

       System.out.println("Informe o segundo número: ");
       num2 = teclado.nextInt();

       //Process
       soma = num1 + num2;
       
       //Output
       System.out.println("A soma é " + soma);
       teclado.close();
       

    }
}