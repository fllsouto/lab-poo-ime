/* Progama para calcular o valor de 5 Fatorial */

public class Fatorial {

public static void main (String args[]){

double x = 69; // aqui criamos uma vari�vel que ir� armazenar o numero do fatorial
double f = x; // aqui criamos outra var. Ser� o resultado tempor�rio da multiplica��

while (x > 1){ // Enquanto x for menor que 1 fa�a o que est� entre as chaves

  f = f *(x-1); // A vari�vel tempor�ria ira receber o resultado da multiplica�� dela, pelo valor de x menos 1
  x--; // aqui decrementamos o valor de x em um, no final do loop
  System.out.println(f); // Esse comando imprime o valor de f. O �ltimo ser� o valor final do Fatorial.
                    }
                                                         }
                                    }
