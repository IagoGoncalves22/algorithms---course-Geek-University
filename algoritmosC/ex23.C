#include<stdio.h>

int main() {
    //Declaration of variables
    int numero;

    //Input
    printf("Informe um número entre 1 e 10: ");
    scanf("%d", &numero);
    

    //Process
    while(numero < 1 || numero > 10) {
        printf("Informe um número entre 1 e 10: ");
        scanf("%d", &numero);
    }    
    for(int i = 1; i <=10; i++){
        printf("%d X %d\n", numero, i, (numero * i));
    }

    //Output
    
}