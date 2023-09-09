import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int numero, p = 0, i = 0;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe um número: ");
       numero = teclado.nextInt();

       //Process
       if(numero % 2 == 0){
        p = numero;
       }else{
        i = numero;
       }
       System.out.println(p);
       System.out.println(i);
       teclado.close();
       
       //Output
       

    }
}