/* Progama para calcular o valor de 5 Fatorial */

public class Fatorial {

public static void main (String args[]){

double x = 69; // aqui criamos uma variável que irá armazenar o numero do fatorial
double f = x; // aqui criamos outra var. Será o resultado temporário da multiplicaçã

while (x > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves

  f = f *(x-1); // A variável temporária ira receber o resultado da multiplicaçã dela, pelo valor de x menos 1
  x--; // aqui decrementamos o valor de x em um, no final do loop
  System.out.println(f); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
                    }
                                                         }
                                    }
