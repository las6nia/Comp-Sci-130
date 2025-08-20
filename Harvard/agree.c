#include <stdio.h>
// READ - I RATHER NOT USE THE CS50X LIBRARIES TO UNDERSTAND THE FULL C LANGUAGE FROM SCRATCH 
int main(void)
{
    char input = printf("Do you agree? (y/n) ");
    scanf("%c", &input);

    if (input == 'y' || input == 'Y')
    {
        printf("perfect! let's get you started!\n");
    }
    else if (input == 'n' || input == 'N')
    {
        printf("Sounds good, have a beautiful day!\n");
    }
    else
    {
        printf("Enter a valid character\n"); // would be good to make a loop to continue to enter a number
    }
}
