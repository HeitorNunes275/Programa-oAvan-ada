#include <stdio.h>

int main() {
    
    FILE *file;
    int a, b, c;
    file = fopen("valores.txt", "w");

    scanf("%d %d %d", &a, &b, &c);

    fprintf(file, "%d %d %d", a, b, c);

    fclose(file);
}