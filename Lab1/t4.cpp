#include <stdio.h>
int main(){
    int times;
    double num, result = 1.0;
    printf("How many floating point numbers do you want to multiply together: ");
    scanf("%d", &times);
    for (int i = 0; i < times; i++){
        printf("Enter a floating point number: ");
        scanf("%lf", &num);
        result *= num;
    }
    printf("The product is %lf\n", result);
    return 0;
}