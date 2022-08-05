#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {

    int a, b, c;
    float media;
    
    a = atoi(argv[1]);
    b = atoi(argv[2]);
    c = atoi(argv[3]);
    
    media = (a+b+c)/3;

    printf("%f\n", media);

    return 0;
}