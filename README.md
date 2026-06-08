# Estruturas de Dados: Implementação de Filas (Queue)

Este projeto tem como objetivo o estudo e a implementação da estrutura de dados **Fila (Queue)** utilizando duas abordagens distintas em Java: baseada em **Array (estática)** e baseada em **Lista Encadeada (dinâmica)**.

## 🚀 Evolução do Projeto

O desenvolvimento foi estruturado para garantir a reutilização de código e a padronização das operações através de uma interface comum (`QueueTAD`).

* **Definição do TAD (Tipo Abstrato de Dados):** Criação da interface `QueueTAD<T>`, que estabelece o contrato básico para qualquer implementação de fila (operações de inserção, remoção, consulta e verificação de estado).
* **Implementação `ArrayQueue`:** Implementação baseada em arranjo circular. Foca no uso eficiente de um espaço de memória previamente alocado, utilizando o operador de resto (`%`) para realizar o giro lógico do array.
* **Implementação `LinkedQueue`:** Implementação dinâmica utilizando a classe de suporte `Node<T>`. Esta abordagem remove a limitação de capacidade fixa do array, crescendo conforme a necessidade.
* **Testes:** Estruturação de uma classe `Main` para validar o comportamento de ambas as implementações através de baterias de testes.

## 📊 Comparativo de Eficiência

### 1. ArrayQueue (Fila baseada em Array/Estática)

* **Complexidade de Tempo:** Todas as operações principais (push, pop, peek) possuem complexidade **O(1)**.
* **Uso de Memória:** Ocupa um espaço fixo, definido na inicialização da estrutura.
* **Vantagens:** * Acesso mais rápido aos dados devido à localidade de referência (elementos contíguos na memória, favorecendo o cache da CPU).
    * Não há custo extra de criação de objetos a cada inserção.
* **Desvantagens:** * Limitação de capacidade: Se o array estiver cheio, não é possível adicionar mais itens (a menos que seja implementado redimensionamento).

### 2. LinkedQueue (Fila baseada em Lista Encadeada/Dinâmica)

* **Complexidade de Tempo:** Todas as operações principais (push, pop, peek) possuem complexidade **O(1)**.
* **Uso de Memória:** Variável. A memória é alocada conforme novos elementos são adicionados.
* **Vantagens:** * Flexibilidade total: A fila cresce dinamicamente conforme a demanda, limitada apenas pela memória RAM disponível.
* **Desvantagens:** * Overhead (custo) de memória: Para cada novo elemento, é necessário criar um objeto `Node` adicional, que guarda o dado e o ponteiro para o próximo elemento.

---

### Resumo dos pontos principais

* **ArrayQueue:** Preferível quando você conhece o tamanho máximo dos dados e busca performance máxima e eficiência de memória.
* **LinkedQueue:** Preferível quando o volume de dados é imprevisível e você precisa que a estrutura se adapte dinamicamente ao crescimento.
