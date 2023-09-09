#include<stdio.h>

int main() {
    //Declaration of variables
    int vetor[10];
    char tem_valor_50 = 0;

    //Input
    for(int i = 0; i < 10; i++){
        printf("informe o valor para o vetor %d/10: ", (i+1));
        scanf("%d", &vetor[i]);
    }
    
    for(int i = 0; i < 10; i++){
        if(vetor[i] > 50){
            printf("O número %d está na posição %d\n", vetor[i], i);
            tem_valor_50 = 1;
        }
    }
    if(tem_valor_50 < 1) {
        printf("Não existe nenhum número maior que 50.");
    }
    //Process
    

    //Output
    
}