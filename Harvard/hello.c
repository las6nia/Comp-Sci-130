//first time downloading and installing libraries - cc hello.c -o hello cs50.c, ./hello
#include <stdio.h>
#include "cs50.h"

int main(void)
{
    string name = get_string("what is your name?");
    printf("Hello, %s", name);
}
