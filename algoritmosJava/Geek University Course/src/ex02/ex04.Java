import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int metros, centimetros;

       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("informe o valor em metros: ");
        metros = teclado.nextInt();

       //Process
       centimetros = (metros * 100);
       
       //Output
       System.out.println(metros + " metros em centímetros é " + centimetros);
        teclado.close();
    }
}