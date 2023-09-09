import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int numero;
       Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Informe um número entre 1 e 10: ");
      numero = teclado.nextInt();

       //Process
       while(numero < 1 || numero > 10) {
        System.out.println("Informe um número entre 1 e 10: ");
        numero = teclado.nextInt();
       }
       for(int i = 1; i <= 10; i++) {
        System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
       }
       teclado.close();
       //Output
       

    }
}