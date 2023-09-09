import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int n;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe um número: ");
      n = teclado.nextInt();

       //Process
       if(n > 100){
        System.out.println(n);
       }else{
        n = 0;
        System.out.println(n);
       }
       teclado.close();
       //Output
       

    }
}