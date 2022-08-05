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

    if (id == 0) {
        
        close(fd[0]);
        
        int somaPares;
        for (int i=0; i <= 10; i++) {
            if (i%2 == 0) {
                somaPares += i;
            }
        }

        write(fd[1], &somaPares, sizeof(somaPares));

    }

    if (id > 0) {
        int somaPares;
        close(fd[1]);
        

        int somaImpares;
        for (int i=0; i < 10; i++) {
            if (i%2 != 0) {
                somaImpares += i;
            }
        }

        read(fd[0], &somaPares, sizeof(somaPares));
        printf("A soma dos números de 1 a 10 é %d.\n", somaPares+somaImpares);

    }

    return 0;

    
}