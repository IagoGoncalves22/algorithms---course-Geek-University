import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       float[] vetor = new float[5];
       int codigo;
        Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Informe o código: ");
      codigo = teclado.nextInt();

       //Process
       if(codigo !=0){
        for(int i = 0; i <5; i++) {
            System.out.println("Informe um número real: ");
            vetor[i] = teclado.nextFloat();
        }
        if(codigo == 1){
            for (int i = 0; i < 5; i++){
                System.out.println(vetor[i]);
            }
        }
        if(codigo >= 2){
            for (int i = (vetor.length - 1); i >= 0 ; i--){
                System.out.println(vetor[i]);
            }
        }
       }
       teclado.close();

       //Output
       

    }
}