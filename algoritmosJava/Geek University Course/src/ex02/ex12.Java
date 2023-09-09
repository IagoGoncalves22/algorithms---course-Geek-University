import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       int num1, num2, num3, num4, q1, q2, q3, q4;
       Scanner teclado = new Scanner(System.in);

       //Input
       System.out.println("Informe o número 1: ");
       num1 = teclado.nextInt();
       System.out.println("Informe o número 2: ");
       num2 = teclado.nextInt();
       System.out.println("Informe o número 3: ");
       num3 = teclado.nextInt();
       System.out.println("Informe o número 4: ");
       num4 = teclado.nextInt();

       //Process
       q1 = num1 * num1;
       q2 = num2 * num2;
       q3 = num3 * num3;
       q4 = num4 * num4;

       if(q3 >= 1000){
        //Output
        System.out.println(q3);
       }else {
        //Outputs
        System.out.printf("Num1: " + num1 + "Quadrado: " + q1);
        System.out.printf("Num2: " + num2 + "Quadrado: " + q2);
        System.out.printf("Num3: " + num3 + "Quadrado: " + q3);
        System.out.printf("Num4: " + num4 + "Quadrado: " + q4);
       }
       teclado.close();
       
       

    }
}