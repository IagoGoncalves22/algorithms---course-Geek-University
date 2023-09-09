public class ex01 {

    public static void main(String[] args) {
        // Variables
        int num1, num2, soma, multiplicacao;
        Scanner teclado = new Scanner(System.int);

        //Input
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();

        //Process
        soma = num1 + num2;
        multiplicacao = soma * num1;

        //Output
        System.out.println("O resultado da multiplicação é " + multiplicacao)

        teclado.close();

    }
}