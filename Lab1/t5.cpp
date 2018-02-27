#include <stdio.h>
void array_abs(double arr[5]){//Get the absolute value of every element in the array
    for (int i = 0; i < 5; i++){
        if (arr[i] < 0)
            arr[i] = -arr[i];
    }
}
int main(){
    double arr[5];
    for (int i = 0; i < 5; i++){//Scan 5 elements in array
        printf("Enter a floating point number: ");
        scanf("%lf", &arr[i]);
    }
    array_abs(arr);
    printf("The result is: ");
    for (int i = 0; i < 5; i++){//Print out absolute value of every elements in array
        printf("%lf ", arr[i]);
    }
    puts("");
    return 0;
}