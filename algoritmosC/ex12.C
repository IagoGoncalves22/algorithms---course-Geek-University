#include<stdio.h>

int main() {
    //Declaration of variables
    float p, m;
    char e[8] = "excesso"; // '\0'

    //Input
    printf("Informe o peso dos peixes: ");
    scanf("%f", &p);

    //Process
    if(p > 50) {
        m = (p - 50) * 4.00;
        printf("você deverá pagar R$ %2.f em multas.", m);
    }else{
        m = 0;
        e[0] = 0;
        printf("Multa: %.2f", m);
        printf("Excesso: %d", e[0]);
    }
    

    //Output
    
}