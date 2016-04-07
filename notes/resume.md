## Resumo Laboratório de Programação Orientada a Objetos

### Visão geral da POO

Como crescer um software de forma sustentável?

Interesses do POO:
- Proximidade com a realidade
- Facilidade de utilização
- Construção de código reutilizavel
- Facilidade de evolução

No POO puro:
- Tudo é um objeto (Nem tudo por que na prática quando se tem herança você precisa ter tipos primitivos. Na teoria é possível, na prátiva não)
- Um programa é um conjunto de objetos que comunicam
- Cada objeto pode ser composto por outros objetos
- Cada objeto de um tipo (Classe, mas temos exemplos como no javascript que objetos podem não ter classe)
- Objetos de um mesmo tipo recebem os mesmos tipos de mensagens
- Suas principais características são: **Herança**, **Encapsulamento**, **Polimorfismo**, que tem caracteristicas de derivação, abstração e mutação respectivamente.

### Encapsulamento
Um objeto é composto de **dados** e **métodos** que operam esses dados. Uma boa prática em OO é restringir o acesso aos dados de um objeto, fazemos isso utilizando **modificadores de visibilidade**, isso garante que apenas a classe a qual aquele objeto pertence implementa e manipula os dados, isso é chamado de encapsulamento, a implementação de determinado método é oculto para quem o está chamando, o cliente apenas requesita um serviço para aquele objeto através dos metodos visiveis por ele (sua interface pública, ou API). Essa centralização do funcionamento dentro da classe permite que futuras mudanças sejam possíveis dentro de quem oferece o serviço sem que o cliente mude sua chamada.

#### Abstração de dados
Os dados compoem o estado interno de um objeto, portanto eles não devem ser visíveis para o cliente. Apenas os métodos do objeto devem alterar o estado interno de um objeto, com isso conseguimos um total encapsulamento. Um cliente manipular e editar diretamente o estado de um objeto é considerado uma **quebra de encapsulamento**.

#### Interface
A interface de um objeto são todas as mensagens que consegue entender, e a interface de um objeto caracteriza o seu tipo. A interface também pode ser entendido com o conjunto de assinaturas que o objeto entende, que por sua vez é o **nome e a lista de parâmetros** que o objeto entende. Por isso que se dois objetos possuem exatamente a mesma interface eles são de um mesmo tipo.

### Classe
Todo objeto é instância de uma classe. Uma classe é a definição de um modelo, de atributos e comportamentos que aquele objeto tem que ter.

### Herança
Uma classe podem herdar comportamentos e atributos de uma outra classe, isso permite uma continuidade do funcionamento, uma generalização e especialização de determinados comportamentos. O ponto central da herança é o reaproveitamento de comportamentos. Através de herança é possível herdar métodos, e esses podem ser utilizados puramente ou reimplementados pelas classes filhas.

#### Upcasting
É quando a classe filha invoca um médoto que está definido na classe pai
```
|Veículo		  |
-------------------
|int quantoCusta()|
	^
	|
	|
|Carro		  		 |
----------------------
|String combustivel()|
|int autonomia()	 |

Carro gol = new Carro();
gol.quantoCusta();
```

#### Downcasting
É a chamada de um método da classe filha por um elemento da classe pai. Isso só é possivel se na hora da chamada o pai realizar um **typecasting** para a classe filha. Isso é uma péssima prática.

### Polimorfismo
Com o polimorfismo é possível desacoplar a interface(mensagem) da implementação(método). A mesma mensagem pode produzir resultados diferentes dependendo de quem for o receptor. Podemos obter polimorfismo reimplementando os métodos de uma classe pai ou tendo diferentes assinaturas para um mesmo método. A decisão de qual método chamar só acontece em tempo de execução, isso é chamado de **late-binding** e pode gerar um pequeno overhead, mas compensa pelo código resultante ser muito mais natural. Existe também o conteito de classe abstrata, nela se define a assinatura dos métodos e nas classes derivadas a sua implementação. Existe uma obrigatoridade ao herdar de uma classe abstrata, que é implementar todos os seus métodos assinados, caso contrário um erro é gerado.

### Java

#### Vetores
```
int vec[] = new int[TAMANHO];
vec.length;
```
#### Pontos importantes
- O nome do arquivo tem que ser o mesmo da classe, em cammel case começando com letra maiúscula
- O método main é o ponto de entrada de um programa em java

```
public class TesteWakaFoo {
	// public e static são os modificadores da função. Static indica que é um
    // método de classe, não é necessário um objeto para chamar, e public indica
    // que o método é visível por outros membros de outras classes e faz parte
    // da interface visivel.
    // String[] args é necessário por que o programa pode receber uma entrada
    // de texto. Toda função main precisa ter essa assinatura.
	public static void main(String[] args) {
    	//definição da função
    }
}
```

### Qualidade de Codigo
Um programa bem escrito tem por características:
- Corretude
- Eficiência
- Legibilidade
- Testabilidade

Variaveis tem que ter nomes representativos e não redundantes, nomes de domínio de aplicação são a melhor indicação.

#### Conveções
A convensão adotada pelo Java é o **CamelCase**. Temos como princípios de bom estilo os seguintes:
- Nomes de arquivos e classes começando com letra maiúscula, ex: **ContaUsuario**, **InterfaceAbstrada**, **WakaFooBar**
- Nome de métodos e variáveis começam com letra minuscula, ex: **menorInteiro**, **sacaDinheiro**, **depositaDinheiro**, **máximoDivisorComum**, **peso**
- Espaço antes de abrir um parenteses, não depos. Espaço depois de fechar, não antes, ex: ```for (int i = 0; i < n; i++) j++```
- if com abertura de chave na mesma linha: ```if (x > 0) {```


### Tipo em Java
Para cada tipo primitivo existe um objeto associado, no caso do int o objeto é o Integer

#### Comparação
Um objeto pode ser definido por sua identidade(seu endereço de memória) e seus estados(os dados do objeto). O operador **==** compara a identidade, e o comportamento do método **equals** também. Muitas vezes teremos que sobrescrever o método equals para uma comparação mais próxima da que queremos.

### Funcionamento Interno
As variáveis nunca guardam objetos, ela guardam referências para um determinado tipo de dado, por isso é importante que exista do lado direito o casting correto da variável, por que não basta apontar para uma posição de memória,a variável tem que conhecer a interface pública daquele objeto.

```
//A variavel carro guarda apenas uma referência do objeto criado

Carro carro = new Carro("gol", "1995");
Oficina novaOficina = new Oficina("Oficina do bigode");

//A passagem do parâmetro carro é feita por referência, não por valor.
//Com isso o objeto passado pode ser alterado dentro da função se
//for necessário,por que mantemos o endereço original de memória.

novaOficina.fazVistoria(carro);
```

### Orientação a Objetos em Java

```
//Neste exemplo não temos encapsulamento dos parâmetros da classe ContaCorrente,
//ela mais se parece com uma struct em C
class ContaCorrente {
	public int numConta;
	public String titular;
	public double saldo;
}
```

O construtor de uma classe ajuda a definir os atributos do objeto. Ele deve ter o mesmo nome da classe e **pode ser público ou não**


#### Persistência de dados em Java
Variáveis locais ficam armazenadas na pilha, seu tempo de vida está relacionando com o escopo da sua definição, podendo ser um bloco ou uma função.
Variáveis estáticas são semelhantes a variáveis globais do C, seu tempo é igual ao tempo de execução do programa. Uma porção é alocada no ínicio da execuçao do programa e desalocada no final.
Objetos ficam armazenados no heap, a memória é alocada na criação do objeto e se mantem viva enquanto houver uma referência para objeto. Caso não exista nenhuma referência para a variável o Garbage collector pode liberar a porção de memória do objeto não referenciado. O coletor de lixo pode ser executado explicitamente com o comando ```System.gc()``` ou periódicamente pela JVM.

Com isso temos um modelo de memória no qual a referência para um objeto pode estar :
- Na pilha
- Na memória estática
- No Heap

Objetos **sempre estão no heap**.

#### Dados estáticos
Um método estático não possui **this** e não pode acessar campos não estáticos

```
//Neste exemplo não temos encapsulamento dos parâmetros da classe ContaCorrente,
//ela mais se parece com uma struct em C
class ContaCorrente {
	private static int proximoNumero = 0;
    
    public static int pegaProximoNumero() {
    	return proximoNumero;
    }
}
```

#### Sobrecarga de métodos
Podemos fazer sobrecarga de um método alterando a lista de parâmetros passados na assinatura.

#### Finalizando objetos
Podemos sobrescrever o método finalize, que será chamado quando um objeto deixar de ser referênciado e será consumido pelo GC. O preferível é desalocar recursos sem ter que depender do **finalize()**

### Junit e os testes unitários em Java
Junit é um framework open source que apoio a escrita e execução de testes para programas Java. O Junit utiliza o padrão Xunit, que serve como base para diversos frameworks de teste.

#### Para que serve?
A depuração utilizando impressão é um dos métodos mais utilizados para testar se um código está correto, porém tem a limitação de necessitar do julgamento humano para dizer se está correto o resultado ou não.
Com o Junit a escrita e verificação de corretude torna-se algo mais fácil e natural. O Junit é muito útil quase se precisa garantir a regressão do funcionamento quando uma nova funcionalidade é inserida.


### Controle de Acesso
Existem três níveis de controle e acesso a variáveis e métodos em Java:
- private: São acessíveis apenas dentro da própria classe, acesso por fora não são permitidos
- protected: Os métodos e variáveis são acessíveis apenas para membros de dentro do mesmo **pacote** ou **subclasses**
- public: Os métodos e variáveis são acessiveis de qualquer lugar

Considere o exemplo:
```
|-----------| |-----------|
|Package One| |Package Two|
|-----------| |-----------|
|Alpha      | |AlphaSub   |
|-----------| |-----------|
|Beta       | |Gama       |
|-----------| |-----------|

-------------------------------------------
Modifier | Alpha | Beta | AlphaSub | Gama |
-------------------------------------------
Private  |   Y   |   Y   |   Y      |  Y  |
-------------------------------------------
Protected|   Y   |   Y   |   Y      |  N  |
-------------------------------------------
Public   |   Y   |   Y   |   N      |  N  |
-------------------------------------------
No Mod   |   Y   |   N   |   N      |  N  |
-------------------------------------------
```

### Packages
Packages é uma forma de agrupar um conjunto de classes juntas. Podemos fazer o import de classes com o comando ```import java.math.* ```. No começo de um arquivo temos que preferencialmente dizer a qual package ele pertence, essa nomeação de packages deve preferencialmente fazer sentido quanto o domínio ```package br.usp.ime.nomedomeupackage```, tudo minisculo e sem separação. Cada package pode estar dentro de uma classe pública

#### Diretiva Final
O modificador final é útil quando queremos constantes que não podem ser alteradas, classes que não podem ser extendidas ou métodos que não podem ser sobrescritos.

#### Interface
Interface é uma forma de definir contratos entre as classes que as utilizam. Na interface apenas as assinaturas estão definidas, e na classe que implementa as interfaces está efetivamente a definição do método. Na interface existe basicamente:
- Constantes
- Assinaturas
- Métodos default
- Métodos estaticos
- Tipos aninhados

Uma interface pode implementar outras interfaces, da mesma forma que uma classe pode implementar outras classes. Essa é uma forma de criar uma dualidade de herança.

### Controle de versão
- LVCS (Local version control system) : O armazenamento é local e não é possível colaborar com outros desenvolvedor
- CVCS (Centralized version control system) : Um servidor mantém todos os arquivos. O ponto de falha é se o servidor cair
- DVCS (Ditributed version control system) : Cada cliente tem uma copia de todo repositório, e existe um servidor de referência que guarda todas as informações sincronizadas

