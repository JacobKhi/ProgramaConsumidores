## Projeto de Manipulação e Ordenação de Consumidores em Java

Este projeto em Java implementa um sistema para manipulação e ordenação de dados de consumidores a partir de arquivos CSV. O foco está na aplicação de conceitos de orientação a objetos, como interfaces, herança, agregação etc.

## Funcionalidades

Leitura e escrita de consumidores a partir de arquivos CSV

- Implementação de diferentes estruturas para armazenar consumidores (Lista e Vetor)

- Aplicação de algoritmos de ordenação (Bubble Sort e Quick Sort)

- Ordenação de consumidores por ano de nascimento e escolaridade

- Interface gráfica ou textual para listar e manipular os dados

## Arquitetura

- Interfaces definem contratos para ordenação (Ordenador) e manipulação de coleções de consumidores (ColecaoDeConsumidores).

- Classes concretas implementam essas interfaces com diferentes estruturas (vetores e listas).

- Ordenadores específicos aplicam algoritmos de ordenação sob diferentes critérios.

- ManipularDataset cuida da leitura/escrita de arquivos CSV.

- ProgramaConsumidores e App são pontos de entrada e execução das funcionalidades.
