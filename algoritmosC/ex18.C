#include<stdio.h>

int main() {
    //Declaration of variables
    int n, maior = 0;

    //Input
    printf("Informe um número: ");
    scanf("%d", &n);

    //Process
    while(n != 0) {
        if(n > maior) {
            maior =n;
        }
        printf("Informe o número: ");
        scanf("%d", &n);
    }
    printf("O maior número é %d", maior);

    //Output
    
}