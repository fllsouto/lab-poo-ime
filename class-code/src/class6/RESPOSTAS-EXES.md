## Lista 6

### Exercício 1 - Derivada
A construção da classe derivada acontece logo em seguida da construção da classe Base. Na ordem de execução "Constrói Base" é impresso antes de "Constrói Derivada". 

Ao adicionar um parâmetro inteiro a classe base e alterar a assinatura do construtor o seguinte erro acontece:
```
Implicit super constructor Base() is undefined. Must explicitly invoke another constructor
```
Ou seja, como alteramos a assinatura do construtor base sua chamada não pode ser mais implícita, temos que adicionar uma chamada explícita com a palavra "super".

### Exercício 2 - ExercicioFinal
No exercício 2 estão implementados duas classes diferentes, Parent e Child. Em Parent está definido dos qualificadores final em três elementos diferentes, na variável estática **finalConstant**, método **getName** e na variável **name**. Qualquer tentativa de de sobrescrita ou reatribuição gera um erro de compilação, mostrando que membros com qualificadores final são imutáveis. A diferença entre os três reside no fato de serem ou não compartilhados entre os objetos. No caso do atributo name um erro ocorre ao tentar alterar o setado na inicialização do objeto. Os exemplos que geram erros estão comentados no código.

### Exercício 3 - ParentFinal
O erro apresentado é:
```
The type ChildFinal cannot subclass final class ParentFinal
```

### Exercício 4 - FixedPoint
Ao instanciar um FixedPoint para uma referência final não é possível alterar essa referência para um outro objeto. Apenas **p** não pode ser mutado, mas os atributos do objeto sim, estes não são final. Além disso não é possível atribuir um valor null para **p** por sua natureza imutavel.

### Exercício 5 - Mamifero
O polimorfismo é baseado na descoberta de métodos em tempo de execução e na chamada implícita. Animal e Mamífero implementam o mesmo método _nasce_, quando um objeto da classe mamífero chama esse método sem parâmetros acabamos por chamar o método _nasce_ definido em Animal. No caso de um referência para Animal, que recebe depois um objeto do tipo Mamífero, a chamada do método nasce primeiro vai até a classe pai para verificar se existe um método implementado com esse nome, depois de verificar ele procura se o próprio objeto também tem esse método, no caso Mamífero, neste cenário ambas assinaturas tem que ser exatamente iguais. Como ele o tem o método cresce do Mamífero é chamado. Alterando a chamada da linha 31 para _x.nasce(2)_ percebemos que ocorre um erro de compilação, pois essa assinatura não existe na classe pai, mas sim na classe filho. Para que funcione corretamente Pai e Filho precisam compartilhar uma mesma assinatura.

Quanto a adição do método _sangueQuente()_ para um animal conseguir chama-lo precisa haver typecasting, como acontece na linha 34.

### Exercício 6 - Homem
A classe Homem herda os métodos _nasce_ e _cresce_ de Mamifero2 e os sobscreve com a mesma assinatura, isso ofusca possíveis chamadas aos métodos da classe Mamifero2 é o que conhecemos por **overriding**. Ao alterar a assinatura do método _nasce_ na classe Mamífero e chamar **h.nasce(1)** causamos uma sobrecarga (**overloading**) na classe Homem, em tempo de execução a JVM irá procurar por essa assinatura na árvore de herança a qual Homem pertence e executar o método.

## Exercício 7 - TestaVeiculos
É possível usar os métodos não abstratos _set_ e _get_ da classe abstrata Veículo para atribuir e recuperar o valor dos diferentes veículos.

## Exercício 8 - DerivadaOito
Mesmo fazendo o typecasting para a classe BaseOito e executando o metodoUm, o metodoDois da classe DerivadaOito continua sendo chamado, pois ele está ofuscando (overriding) a implementação deste método por BaseOito, mesmo que façamos o uppercasting da variável isso não muda que em tempo de execução o método encontrado pela JVM seja o metodoDois da Derivada8.

## Exercício 9 - Abstract9
Conforme esperado a chamada do método _methodFoo_ funciona, o funcionamento está comentado no código. Criando uma assinatura abstrata na classe _AbstractWithoutMethods_ não é mais necessário fazer o typecasting, pois a classe DerivatedAbstract está implementando o método abstrato.

## Exercício 10
Java, diferente de outras linguagens como C++, não aceita herança Múltipla. Uma tentativa de emular esse comportamento é através de interfaces, uma classe pode implementar diversas interfaces, por exemplo:

```
public interface Ave {}
public interface Mamifero {}

public Ornitorrinco implements Ave, Mamifero {}
```

Porém essa técnica é muito discutida na comunidade Java, onde muitos programadores acham que interfaces deveriam descrever ideias abstratas e não objetos concretos, como por exemplo:
```
public interface PodeVoar {}
public interface Equino {}
public interface Mamifero {}

public class Cavalo implements Equino, Mamifero {}
public class Pegasus extends Cavalo implements PodeVoar {}
```

## Exercício 11 - ThreePublic
É possível compilar o programa apenas se existir uma classe pública dentro do arquivo, essa classe é a porta de entrada da JVM para começar a executar um programa, e o método main é a função inicial do programa. Precisamos de apenas um método main para executar o programa. A existência de mais de um método desse pode ser útil caso se queira definir diferentes formas de execução inicial de um mesmo programa, porém existem formas muito mais performaticas e menos sucetíveis a erros de fazer isso.

