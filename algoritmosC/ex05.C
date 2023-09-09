#include <stdio.h>

int main() {
    //Declaration of variables
    int meters, centimeters;

    //Input
    printf("Type the value in meters: ");
    scanf("%d", &meters);

    //Process
    centimeters = (meters * 100);

    //Output
    printf("%d meters in centimeters is %d", meters, centimeters);
}