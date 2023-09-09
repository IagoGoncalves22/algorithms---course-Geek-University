#include<stdio.h>
#include<ctype.h>

int main() {
    //Declaration of variables
    float hight, ideal_weight;
    char gender;
    setbuf(stdout, NULL);

    //Input
    printf("Type your gender m/f: ");
    scanf("%c", &gender);   
    printf("Type your hight: ");    
    scanf("%f", &hight);    
     

    //Process
    if(gender == 'm'){
        ideal_weight = (72.7 * hight) - 58;
        printf("Your ideal weight is %.2f", ideal_weight);
    }
    if(gender == 'f'){
        ideal_weight = (62.1 * hight) - 44.7;
        printf("Your ideal weight is %2.f", ideal_weight);
    }
    if(gender != 'm' && gender !='f'){
        printf("The gender is unknown. \n");
    }

    //Output    
}