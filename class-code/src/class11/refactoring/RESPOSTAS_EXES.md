## Lista 10

### Exercício 1
A solução está implementada nos arquivos **Factorial.java** e **FactorialTest.java**.

### Exercício 2

```
public class AnnualDateRule () {
	/*
	* Construtor padrão .
	*/
	protected AnnualDateRule () {
	}
	/** Dia do mês . */
	private int dayOfMonth ;
	/**
	* Retorna o dia do mês .
	* *
	@return o dia do mês
	*/
	public int getDayofMonth () {
		return dayOfMonth ;
	}
}
```

Os comentários são redundantes e não fornecem nenhuma informação a mais além daquela que pode ser obtida lendo o código. Além disso a definição da classe está errada, o correto é ```public class AnnualDateRule {...```. Por fim a variável **dayOfMonth** é utilizada mas não inicializada, o que pode levar a um problema de execução.

### Exercício 3
Comentários muitas vezes são utilizados para explicar trechos de códigos ilegíveis ou de forma redundante, tentando contextualizar uma funcionalidade que poderia ser explicada apenas pelo próprio codigo. A melhor documentação de um código é ela mesma e seus testes. 
Os comentários são úteis na documentação de bibliotecas e APIs quando usadas em conjunto com geradores automáticos de documentação, como o Javadoc.

### Exercício 4
Por que no segundo caso o comentário foi substituído por uma constante que tem em seu nome toda a semântica necessária para o seu entendimento.

