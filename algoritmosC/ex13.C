#include<stdio.h>

int main() {
    //Declaration of variables
    int c;
    float n, e = 0, salario, valor_hora = 10.00;

    //Input
    printf("Informe o código: ");
    scanf("%d", &c);
    printf("Informe a quantidade de horas trabalhadas: ");
    scanf("%f", &n);
    

    //Process
    if (n > 50) {
        e = (n - 50) * 20.00;
        salario = (50 * valor_hora) + e;

        //Output
        printf("Salário Total R$ %.2f", salario);
        printf("Salário excedente R$ %.2f", e);
    }else{
        //Output
        salario = n * valor_hora;
        printf("Salário Total R$ %.2f", salario);
        printf("Salário excedente R$ %.2f", e);
    }

    //Output

    
}