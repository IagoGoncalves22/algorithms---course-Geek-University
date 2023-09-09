#include<stdio.h>

int main() {
    //Declaration of variables
    int number, p = 0, i = 0;

    //Input
    printf("Type a number: ");
    scanf("%d", &number);

    //Process
    if(number % 2 == 0) {
        p = number;
    }else{
        i=number;
    }
    printf("%d\n", p);
    printf("%d", i);
    

    //Output
    
}