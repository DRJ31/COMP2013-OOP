#include <stdio.h>
int main(){
    int times;//The amount of numbers which will be input
    double num, result = 1.0;
    printf("How many floating point numbers do you want to multiply together: ");
    scanf("%d", &times);//Obtain amount of numbers
    for (int i = 0; i < times; i++){//Scan numbers by loop
        printf("Enter a floating point number: ");
        scanf("%lf", &num);
        result *= num;
    }
    printf("The product is %lf\n", result);//Print out the result
    return 0;
}