#include <stdio.h>
int main(){
    int start, end;
    printf("Enter the start integer: ");
    scanf("%d", &start);//Scan the first integer
    printf("Enter the end integer: ");
    scanf("%d", &end);//Scan the second integer
    for (int i = start; i <= end; i++){
        printf("%d ", i);//Print out numbers in sequence
    }
    puts("");//Line break
    return 0;
}