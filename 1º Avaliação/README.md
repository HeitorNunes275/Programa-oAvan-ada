Primeira abordagem:



O mecanismo de comunicação escolhido foi o PIPE, uma chamada de sistema que utiliza descritores de arquivo para escrever/ler valores/texto e envia para um outro processo criado pela chamada de sistema FORK.

Ao executar o programa, insira três valores inteiros que serão armazenados no vetor v pelo processo FILHO. Escrevendo esse vetor usando a função write e lendo esse valores pelo processo PAI, calculamos a media e esta é mostrada na saída padrão.


Segunda abordagem:


A segunda forma utiliza o mecanismo de escrita/leitura em um arquivo texto .txt, o programa "media2.c" escreve em um arquivo chamado valores.txt (Cria se não existir) e lê três valores inteiros da entrada padrão que os armazena nas variáveis a, b e c, em seguida a função fprintf escreve esses valores no arquivo separado por espaços. O programa "media2LER.c" pega esses valores no arquivo texto e armazena nas suas variáveis x, y e z... mostrando sua média na saída padrão.


Terceira abordagem:


Utiliza argumentos na linha de comando da própria função main que será inserido na linha de execução do programa. EX:. ./media3 10 20 30
Onde os três inteiros são 10, 20 e 30 respectivamente.
