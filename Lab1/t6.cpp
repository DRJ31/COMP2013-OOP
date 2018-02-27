#include <stdio.h>
#define MONTHS 12
int main(){
    //Array to store how many days in a month
    int day_in_month[MONTHS] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month, day, result = 0;
    while(true){//Input and check if the value of month is valid
        printf("Enter the month: ");
        scanf("%d", &month);
        if (month > 0 && month < 13)
            break;
    }
    while(true){//Input and check if the value of day is valid
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