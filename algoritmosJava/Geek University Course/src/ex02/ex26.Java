import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int[] vetor = new int[20];
       int soma = 0;
       Scanner teclado = new Scanner(System.in);

       //Input
      for (int i = 0 ; i < 20; i++){
        System.out.printf("Informe o valor para o vetor %d/20\n", (i+1));
        vetor[i] = teclado.nextInt();
        soma = soma + vetor[i];

    }
    System.out.printf("A soma é %d", soma);
    teclado.close();

       //Process
       
       //Output
       

    }
}