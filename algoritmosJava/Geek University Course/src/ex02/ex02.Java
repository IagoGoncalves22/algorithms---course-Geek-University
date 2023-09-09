import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
       //Variables
       int quantidade_minima, quantidade_maxima;
       float estoque_medio;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe a quantidade mínima: ");
       quantidade_minima = teclado.nextInt();

       Sysout.out.println("Informe a quantidade máxima: ");
       quantidade_maxima = teclado.nextInt();

       //Process
       estoque_medio = (quantidade_minima + quantidade_maxima);

       //Output
       Sysout.out.println("O estoque médio é " + estoque_medio);

       teclado.close();

    }
}
