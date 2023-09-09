#include<stdio.h>

int main() {
    //Declaration of variables
    int vetor1[10], vetor2[10], soma[10];

    //Input
    for (int i = 0; i < 10; i++) {
        printf("Informe o valor para o primeiro vetor: ");
        scanf("%d", &vetor1[i]);
        printf("Informe o valor para o segundo vetor: ");
        scanf("%d", &vetor2[i]);

        // Process
        soma[i] = vetor1[i] + vetor2[i];
    }
    
    //Process
    for (int i = 0; i < 10; i++) {
        printf("%d\n", soma[i]);
    }
    

    //Output
    
}