## Lista 8

## Exercício 1
O problema foi implementado como **FactorialSwing**.

## Exercício 2
Podemos testar a camada do modelo, controller e exceptions através de testes unitários com o Junit. Para testar a View o ideal é aplicar testes de **aceitação**, onde verificamos se sistema está em conformidade com as regras estabelecidas. Podemos testar a resposta de um evento ao clicar em um botão, ou o aparecimento de uma determinada informação na interface, por exemplo.

## Exercício 3
A classe implementada foi **DataStructureBox** e os testes estão em **DataStructureBoxTest**. Preferi implementar apenas as estruturas _LinkedList_, _ArrayList_ e _Stack_ pois todas herdam sua estrutura de _AbstractList_, _Set_ é uma interface então fica mais complicado generalizar um comportamento para as quatro estruturas de dados.

## Exercício 4
Os dois métodos implementados que utilizam **Iterator** são **vectorProduct** e **vectorSum**, que calculam respectivamente o produto escalar de uma lista abstrata com a outra e a soma de ambas.