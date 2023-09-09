import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       float indice;
       Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Informe o índice de poluição: ");
      indice = teclado.nextFloat();

       //Process
       if(indice >= 0.3 && indice < 0.4) {
        System.out.println("Atenção: Indústrias do primeiro grupo devem suspender as atividades.");
       } else if(indice >= 0.4 && indice < 0.5) {
        System.out.println("Atenção: Indústrias do primeiro e segundo grupo devem suspender as atividades.");
       }else if (indice >= 0.5) {
        System.out.println("Atenção: Tods os grupos devem suspender as atividades.");
       }
       teclado.close();
       //Output
       

    }
}