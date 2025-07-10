# 📚 Desafios Progressivos de Java

Este repositório contém uma série de desafios progressivos de programação, do curso Batismo de Java, disponível em https://aluno.java10x.dev/

## **🎯 Desafio 1**
**Descrição:**
Programa básico que representa três ninjas da Vila da Folha com suas respectivas missões. Implementa lógica condicional para determinar se um ninja pode concluir uma missão baseado em sua idade e nível de dificuldade.

**Conceitos Aplicados**
* **Tipos de Dados Primitivos**: `int`, `char`, `boolean`
* **Tipo de Dados de Referência**: `String`
* **Declaração e Inicialização de Variáveis**
* **Estruturas Condicionais**: `if-else if-else`
* **Entrada e Saída**: `System.out.println()`
* **Lógica de Negócio**: Regras condicionais para conclusão de missões
* **Boas Práticas Identificadas**: Nomes descritivos, estrutura organizada
* **Conceitos que Poderiam ser Melhorados**: Repetição de código, oportunidade para POO

**Arquivo**
* `main.java`

## **🏗️ Desafio 2**
**Descrição:**
Sistema completo de gerenciamento de ninjas utilizando orientação a objetos. Permite adicionar, buscar e listar ninjas, incluindo ninjas da família Uchiha com habilidades especiais.

**Conceitos Aplicados**
* **Orientação a Objetos**: Classes, objetos, métodos
* **Herança**: Classe `Uchiha` estende `Ninja`
* **Polimorfismo**: Tratamento polimórfico de objetos
* **Encapsulamento**: Organização de dados e métodos
* **Coleções (Collections)**: `ArrayList` para armazenar ninjas
* **Estruturas de Controle**: `for`, `while`, `switch-case`
* **Entrada e Saída**: `Scanner` para interação com usuário
* **Tratamento de Strings**: `equalsIgnoreCase()`
* **Casting e Verificação de Tipos**: `instanceof`, casting de objetos
* **Modularização**: Separação de responsabilidades entre classes
* **Estruturas de Dados**: Listas dinâmicas
* **Boas Práticas de POO**: Métodos específicos para cada funcionalidade

**Arquivos**
* `Main.java`
* `Menu.java`
* `Ninja.java`
* `Uchiha.java`

## **🚀 Desafio 3**
**Descrição:**
Implementação avançada utilizando interfaces para definir contratos e enums para tipos de habilidades. Demonstra polimorfismo através de interfaces com diferentes tipos de ninjas.

**Conceitos Aplicados**
* **Interfaces**: Definição de contratos com métodos obrigatórios
* **Implementação de Interfaces**: `implements` keyword
* **Enumerações (Enum)**: Conjunto fixo de constantes para tipos de habilidades
* **Construtores**: Inicialização personalizada de objetos
* **Sobrescrita de Métodos (@Override)**: Implementação específica de métodos da interface
* **Polimorfismo**: Diferentes implementações da mesma interface
* **Encapsulamento**: Organização de propriedades e métodos
* **Instanciação de Objetos**: Criação de objetos com construtores
* **Atribuição de Propriedades**: Definição de valores após criação
* **Método Main**: Ponto de entrada da aplicação
* **Contratos de Interface**: Garantia de implementação de métodos
* **Tipos de Dados Customizados**: Enums para representar tipos específicos

**Arquivos**
* `main.java`
* `Ninja.java` (interface)
* `NinjaBasico.java`
* `NinjaAvancado.java`
* `TipoHabilidade.java` (enum)

## **🏦 Desafio 4**
**Descrição:**
Sistema bancário completo que implementa diferentes tipos de contas com operações específicas. Demonstra o uso de classes abstratas, interfaces e herança para criar uma hierarquia robusta de contas bancárias com comportamentos distintos.

**Conceitos Aplicados**
* **Classes Abstratas**: Definição de comportamentos comuns com métodos abstratos
* **Interfaces**: Contratos para operações bancárias obrigatórias
* **Herança**: Especialização de contas através de `extends`
* **Implementação de Interfaces**: `implements` para definir contratos
* **Polimorfismo**: Comportamentos diferentes para o mesmo método
* **Encapsulamento**: Proteção de dados e métodos bem definidos
* **Enumerações (Enum)**: Tipos seguros para categorizar contas
* **Sobrescrita de Métodos (@Override)**: Implementação específica por tipo de conta
* **Construtores**: Inicialização com parâmetros específicos
* **Packages**: Organização de código em pacotes
* **Palavra-chave Super**: Reutilização de construtores da classe pai
* **Instanciação de Objetos**: Criação de diferentes tipos de conta
* **Método Main**: Demonstração completa do sistema
* **Tipos Primitivos**: `double`, `int` para valores monetários
* **Operadores Aritméticos**: Cálculos de taxas e operações bancárias
* **Formatação de Saída**: Mensagens padronizadas para operações

**Arquivos**
* `main.java`
* `Conta.java` (interface)
* `ContaBancaria.java` (classe abstrata)
* `ContaCorrente.java`
* `ContaPoupanca.java`
* `TipoConta.java` (enum)

## **🎓 Objetivos Pedagógicos**
Estes desafios foram desenvolvidos para demonstrar a evolução natural no aprendizado de Java:
1. **Fundamentos**: Variáveis, condicionais, entrada/saída
2. **Orientação a Objetos**: Classes, herança, polimorfismo
3. **Conceitos Avançados**: Interfaces, enums, contratos
4. **Arquitetura Robusta**: Classes abstratas, hierarquias complexas, sistemas completos

Cada desafio constrói sobre o anterior, mostrando como refatorar e melhorar o código conforme novos conceitos são aprendidos.

**Desenvolvido para fins educacionais** 📚
