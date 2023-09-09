#include<stdio.h>

int main() {
    //Declaration of variables
    float hight, ideal_weight;

    //Input
    printf("What is your hight? ");
    scanf("%f", &hight);

    //Process
    ideal_weight = (72.7 * hight - 58);

    //Output
    printf("Your ideal weight is %.2f", ideal_weight);
    
}