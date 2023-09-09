#include<stdio.h>

int main() {
    //Declaration of variables
    float value_per_hour, income;
    int hours_worked;

    //Input
    printf("How much do you make per hour? ");
    scanf("%f", &value_per_hour);

    printf("How muche hour did you work this month? ");
    scanf("%d", &hours_worked);

    //Process
    income = value_per_hour * hours_worked;
    
    //Output
    printf("You will receive R$ %.2f", income);
}