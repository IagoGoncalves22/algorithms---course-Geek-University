#include<stdio.h>

int main() {
    //Declaration of variables
    int valor, maior = -999, menor = 999, soma = 0;
    float media;

    //Input
    for(int i = 0; i < 10; i++){
        printf("Informe um valor: ");
        scanf("%d", &valor);
        if(valor >0){
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            soma = soma + valor;
        } else {
            i--;
        }
    }
    //Process
    //Output
    media = soma / 10;
    printf("O maior número é %d\n", maior);
    printf("O menor número é %d\n", menor);
    printf("A média dos números é %.2f", media);
}