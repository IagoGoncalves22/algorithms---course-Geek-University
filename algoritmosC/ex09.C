#include<stdio.h>

int main() {
    //Declaration of variables
    int number, a, b;

    //Input
    printf("Type a number: ");
    scanf("%d", &number);    

    //Process
    if (number > 0) {
        a = number;
        printf("The number is positive.");
    }else {
        b = number;
        printf("The number is negative.");
}

    //Output
    printf("%d", number);
    
}