import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       float p, m;
       String e = "excesso";
       Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Informe o peso dos peixes: ");
      p = teclado.nextFloat();

       //Process
       if(p > 50) {
        m = (float) (4.00) * (float) (p - 50);
        System.out.printf("Você deverá pagar R$" + m + "em multas.");
       }else {
        m = 0;
        e = "0";
        System.out.println("Multas: " + m);
        System.out.println("Excesso: " + e);
       }
       teclado.close();
       //Output
       

    }
}