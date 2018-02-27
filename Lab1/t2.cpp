#include <stdio.h>
double abs(double num){//Find out the absolute value of an integer
    return num < 0 ? -num : num;
}
int main(){
    double number;
    printf("Enter a floating-point number: ");
    scanf("%lf", &number);//Get the user's input number
    printf("The absolute value of %lf is %lf\n", number, abs(number));
    return 0;
}