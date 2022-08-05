#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(void) {

    int fd[2];
    pid_t id;

    if (pipe(fd)<0) {
        perror("pipe");
        return -1;
    }

    if ((id = fork()) < 0) {
        perror("fork");
        exit(1);
    }   

    if (id > 0) {

        int v[3];
        close(fd[1]);

        read(fd[0], &v, sizeof(v));

        float media = (v[0] + v[1] + v[2])/3;
        printf("Media aritmetica: %.2f\n", media);

    }

    if (id == 0) {
        
        close(fd[0]);
        
        int v[3];

        scanf("%d", &v[0]);
        scanf("%d", &v[1]);
        scanf("%d", &v[2]);

        write(fd[1], &v, sizeof(v));

    }

    return 0;
}