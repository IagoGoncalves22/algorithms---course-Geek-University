import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int numero;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe um número: ");
       numero = teclado.nextInt();
      
       //Process
       if(numero % 2 == 0){
        if(numero > 0) {
            System.out.printf("O número " + numero + " é par e positivo.\n");
        }else {
            System.out.printf("O número " + numero + " é par e negativo.\n");
        }
       }else {
         if(numero > 0) {
            System.out.printf("O número " + numero + " é impar e positivo.\n");
        }else {
            System.out.printf("O número " + numero + " é impar e negativo.\n");
        }
       }
       teclado.close();
       //Output
       

    }
}