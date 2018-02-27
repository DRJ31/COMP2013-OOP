#include <stdio.h>
#define MONTHS 12
int main(){
    int day_in_month[MONTHS] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month, day, result = 0;
    while(true){
        printf("Enter the month: ");
        scanf("%d", &month);
        if (month > 0 && month < 13)
            break;
    }
    while(true){
        printf("Enter the day: ");
        scanf("%d", &day);
        if (day > 0 && day <= day_in_month[month-1])
            break;
    }
    for (int i = 0; i < month - 1; i++){
        result += day_in_month[i];
    }
    result += day;
    printf("%d/%d is the day number %d in the year.\n", day, month, result);
    return 0;
}