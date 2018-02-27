#include <stdio.h>
int main(){
    int first, second;
    printf("Enter the first integer: ");
    scanf("%d", &first);//Scan the first integer
    printf("Enter the second integer: ");
    scanf("%d", &second);//Scan the second integer
    if (first >= 0 && second >= 0){//Situations when the 2 numbers are both positive
        printf("The integer %d and %d are both positive.\n", first, second);
    }
    else{//Situations when 2 numbers are not both positive
        printf("The integer %d and %d are not both positive.\n", first, second);
    }
    return 0;
}