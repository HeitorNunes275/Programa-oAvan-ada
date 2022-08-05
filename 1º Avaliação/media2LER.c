#include <stdio.h>

int main() {
    
    FILE *file;
    int x, y, z;
    float media;

    file = fopen("valores.txt", "r");

    fscanf(file, "%d %d %d", &x, &y, &z);

    media = (x+y+z)/3;

    printf("%f\n", media);

    fclose(file);
    return 0;
}