/* FONTE:
http://wiki.inf.ufpr.br/maziero/lib/exe/fetch.php?media=socm:socm-livro.pdf
PÁG 71 - Uso do Fork */

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(void) {

    pid_t id = fork();

    if (id < 0) {
        printf("Erro ao criar o processo FILHO!");
        exit(1);
    }

    if (id > 0) {
        printf("Estou no processo PAI e o meu ID é %d. O ID do meu FILHO é %d.\n", getpid(), id);
    }

    if (id == 0) {
        printf("Estou no processo FILHO e o meu ID é %d. O ID do meu PAI é %d.\n", getpid(), getppid());
    }
}