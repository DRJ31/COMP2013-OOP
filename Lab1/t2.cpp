#include <stdio.h>
double abs(double num){
    if (num < 0)
        return -num;
    return num;
}
int main(){
    double number;
    printf("Enter a doubleing-point number: ");
    scanf("%lf", &number);
    printf("The absolute value of %lf is %lf.\n", number, abs(number));
    return 0;
}