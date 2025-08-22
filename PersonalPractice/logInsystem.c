#include <stdio.h>

int main(void)
{
    char name[15];
    char deny[2];
    char created_username;

    char username;
    char password;

    printf("Enter Username, otherwise\n");
    printf("if you don't have one, enter 'n': \n");
    scanf("%14s", &username);
    scanf("%c", &deny);

    if (deny == 'n' || deny == 'N')
    {

        char new_username[20];
        char new_password[30];

        printf("Create a username: \n");
        scanf("%19s", &new_username);
        printf("Great! Your username is %19s\n", new_username);
        Printf("Create a password: ");
        scanf("%30s", new_password);
        printf("Great! Now your password is %30s", new_password);
    }

    else
    {

        char enter_username = printf("Enter your username: ");

        if (enter_username != username)
        {
            printf("Wrong username, Goodbye\n"); // try to do a loop to continue to try again
        }
        else
        {
            printf("Success!")
        }
    }
}
