#include <stdio.h>
void array_abs(double arr[5]){
    for (int i = 0; i < 5; i++){
        if (arr[i] < 0)
            arr[i] = -arr[i];
    }
}
int main(){
    double arr[5];
    for (int i = 0; i < 5; i++){
        printf("Enter a floating point number: ");
        scanf("%lf", &arr[i]);
    }
    array_abs(arr);
    printf("The result is: ");
    for (int i = 0; i < 5; i++){
        printf("%lf ", arr[i]);
    }
    puts("");
    return 0;
}