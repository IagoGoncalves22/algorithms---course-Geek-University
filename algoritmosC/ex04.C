#include <stdio.h>

int main() {
    //Declaration of variables
    int num1, num2, soma;

    //Input
    printf("Type the first number: ");
    scanf("%d", &num1);

    printf("Type the second number: ");
    scanf("%d", &num2);

    //Process
    soma = num1 + num2;

    //Output
    printf("The sum is %d", soma);
}