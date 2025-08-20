#include <stdio.h>

// Hooter Job Application - age requirements
// FIX BUGS!!
int main(void)
{
    int max_age = 29;
    int min_age = 18;
    int thisage;
    char thisjob[] = "Hooters";

    printf("What is Your age? \n");
    scanf("%d", &thisage);

    if (thisage >= min_age && thisage <= max_age)
    {
        printf("You are able to work at %s!\n", thisjob);
    }
    else if (thisage > max_age)
    {
        printf("Since %s only hires at a max age of %d, you do not qualify as you are %d years old.\n", thisjob, max_age, thisage);
    }
    else
    {
        printf("No opportunities at the moment\n");
        printf("Try again later\n");
    }
}
