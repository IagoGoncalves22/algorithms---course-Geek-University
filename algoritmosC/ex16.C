#include<stdio.h>

int main() {
    //Declaration of variables
    float indice;

    //Input
    printf("Informe o índice de pluição: ");
    scanf("%f", &indice);
    

    //Process
    if(indice >= 0.3 && indice < 0.4) {
        printf("Atenção: Indústria do 1 grupo devem suspender as atividades.");
    }else if (indice >= 0.4 && indice < 0.5) {
        printf("Atenção: Indústria do 1 e 2 grupos devem suspender as atividades.");
    }else if (indice >= 0.5) {
        printf("Atenção: Todos os grupos devem suspender as atividades.");
    }
}

    //Output
    
