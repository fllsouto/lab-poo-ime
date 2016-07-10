## Lista 9

## Exercício 1
A solução está implementada na pasta Exercise1.

## Exercício 2
A solução está implementada na pasta Exercise2. Quanto a diferença de tempo entre escrever no arquivo e no terminal, a escrita no arquivo é muito mais rápida. Na biblioteca **PrintWriter** as informações que precisam ser gravadas no arquivo são previamente armazenadas em um buffer, e no final ao chamar o comando close o buffer é descarregado no arquivo. Enquanto que no terminal a cada chamada do comano **System.out.println** o buffer de saída é aberto, escrito e fechado. Este processo é repetido para cada linha, com isso podemos ver linha a linha sendo escrita na saída do terminal, porém é criado um overhead na manipulação do buffer, tornando a execução mais lenta.

## Exercício 3
A solução está implementada na pasta Exercise3 com os devidos testes.