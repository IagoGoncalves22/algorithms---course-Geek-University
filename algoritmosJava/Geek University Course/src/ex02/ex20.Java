import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
       String nome, senha;
       Scanner teclado = new Scanner(System.in);

       //Input
      System.out.println("Informe o nome: ");
      nome = teclado.next();

      System.out.println("Informe a senha: ");
      senha = teclado.next();

       //Process
       while(nome.equals(senha)){
        System.out.println("Erro: O nome de usuário e senha devem ser diferentes.");
        System.out.println("Informe o nome: ");
      nome = teclado.next();

      System.out.println("Informe a senha: ");
      senha = teclado.next();
       }
       teclado.close();
       //Output
       

    }
}