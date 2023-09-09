import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
        int n, maior = 0;
        Scanner teclado = new Scanner(System.in);

       //Input
      System.out.print("Informe um número: ");
      n = teclado.nextInt();

      while(n != 0){
        if(n > maior) {
            maior = n;
        }
         System.out.print("Informe um número: ");
      n = teclado.nextInt();
      }
      System.out.printf("O maior número é " + maior);

      teclado.close();

       //Process
       
       //Output
       

    }
}