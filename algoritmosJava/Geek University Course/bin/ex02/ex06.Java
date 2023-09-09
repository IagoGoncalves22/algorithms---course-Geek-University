import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       float altura, peso_ideal;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("qual a sua altura? ");
       altura = teclado.nextFloat();
      

       //Process
       peso_ideal = (float)(altura * 72.7) - 58; // cast (float)
       //Output
       System.out.printf("Seu peso ideal seria " + peso_ideal);

       teclado.close();       

    }
}