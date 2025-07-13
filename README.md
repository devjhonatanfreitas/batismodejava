# 📚 Desafios Progressivos de Java
Este repositório contém uma série de desafios progressivos de programação, do curso Batismo de Java, disponível em java10x.dev

## 🎯 Desafio 1
**Descrição:** Programa básico que representa três ninjas da Vila da Folha com suas respectivas missões. Implementa lógica condicional para determinar se um ninja pode concluir uma missão baseado em sua idade e nível de dificuldade.

### Conceitos Aplicados
- **Tipos de Dados Primitivos:** int, char, boolean
- **Tipo de Dados de Referência:** String
- **Declaração e Inicialização de Variáveis**
- **Estruturas Condicionais:** if-else if-else
- **Entrada e Saída:** System.out.println()
- **Lógica de Negócio:** Regras condicionais para conclusão de missões
- **Boas Práticas Identificadas:** Nomes descritivos, estrutura organizada
- **Conceitos que Poderiam ser Melhorados:** Repetição de código, oportunidade para POO

### Arquivo
- `main.java`

## 🗂️ Desafio 2
**Descrição:** Sistema simples de cadastro de ninjas utilizando arrays estáticos e estruturas de controle básicas. Implementa um menu interativo para cadastrar e visualizar ninjas com limite máximo de registros. Demonstra fundamentos de programação estruturada e manipulação de arrays.

### Conceitos Aplicados
- **Arrays Estáticos:** Estrutura de dados de tamanho fixo (String[])
- **Estruturas de Repetição:** do-while para loop principal
- **Estruturas de Controle:** switch-case para navegação no menu
- **Entrada e Saída:** Scanner para captura de dados do usuário
- **Manipulação de Strings:** nextLine() para captura de texto
- **Variáveis de Controle:** Contador para gerenciar posições no array
- **Validação de Limites:** Verificação de capacidade máxima do array
- **Menu Interativo:** Interface textual para navegação
- **Estruturas Condicionais:** if-else para validação de estados
- **Loops de Iteração:** for para percorrer arrays
- **Text Blocks:** Formatação de texto multilinha (""")
- **Tratamento de Buffer:** nextLine() após nextInt()
- **Programação Estruturada:** Organização linear de código
- **Controle de Fluxo:** Uso de break para saída de casos
- **Validação de Entrada:** Tratamento de opções inválidas

### Arquivo
- `main.java`

## 🏗️ Desafio 3
**Descrição:** Sistema completo de gerenciamento de ninjas utilizando orientação a objetos. Permite adicionar, buscar e listar ninjas, incluindo ninjas da família Uchiha com habilidades especiais.

### Conceitos Aplicados
- **Orientação a Objetos:** Classes, objetos, métodos
- **Herança:** Classe Uchiha estende Ninja
- **Polimorfismo:** Tratamento polimórfico de objetos
- **Encapsulamento:** Organização de dados e métodos
- **Coleções (Collections):** ArrayList para armazenar ninjas
- **Estruturas de Controle:** for, while, switch-case
- **Entrada e Saída:** Scanner para interação com usuário
- **Tratamento de Strings:** equalsIgnoreCase()
- **Casting e Verificação de Tipos:** instanceof, casting de objetos
- **Modularização:** Separação de responsabilidades entre classes
- **Estruturas de Dados:** Listas dinâmicas
- **Boas Práticas de POO:** Métodos específicos para cada funcionalidade

### Arquivos
- `Main.java`
- `Menu.java`
- `Ninja.java`
- `Uchiha.java`

## 🚀 Desafio 4
**Descrição:** Implementação avançada utilizando interfaces para definir contratos e enums para tipos de habilidades. Demonstra polimorfismo através de interfaces com diferentes tipos de ninjas.

### Conceitos Aplicados
- **Interfaces:** Definição de contratos com métodos obrigatórios
- **Implementação de Interfaces:** implements keyword
- **Enumerações (Enum):** Conjunto fixo de constantes para tipos de habilidades
- **Construtores:** Inicialização personalizada de objetos
- **Sobrescrita de Métodos (@Override):** Implementação específica de métodos da interface
- **Polimorfismo:** Diferentes implementações da mesma interface
- **Encapsulamento:** Organização de propriedades e métodos
- **Instanciação de Objetos:** Criação de objetos com construtores
- **Atribuição de Propriedades:** Definição de valores após criação
- **Método Main:** Ponto de entrada da aplicação
- **Contratos de Interface:** Garantia de implementação de métodos
- **Tipos de Dados Customizados:** Enums para representar tipos específicos

### Arquivos
- `main.java`
- `Ninja.java` (interface)
- `NinjaBasico.java`
- `NinjaAvancado.java`
- `TipoHabilidade.java` (enum)

## 🏦 Desafio 5
**Descrição:** Sistema bancário completo que implementa diferentes tipos de contas com operações específicas. Demonstra o uso de classes abstratas, interfaces e herança para criar uma hierarquia robusta de contas bancárias com comportamentos distintos.

### Conceitos Aplicados
- **Classes Abstratas:** Definição de comportamentos comuns com métodos abstratos
- **Interfaces:** Contratos para operações bancárias obrigatórias
- **Herança:** Especialização de contas através de extends
- **Implementação de Interfaces:** implements para definir contratos
- **Polimorfismo:** Comportamentos diferentes para o mesmo método
- **Encapsulamento:** Proteção de dados e métodos bem definidos
- **Enumerações (Enum):** Tipos seguros para categorizar contas
- **Sobrescrita de Métodos (@Override):** Implementação específica por tipo de conta
- **Construtores:** Inicialização com parâmetros específicos
- **Packages:** Organização de código em pacotes
- **Palavra-chave Super:** Reutilização de construtores da classe pai
- **Instanciação de Objetos:** Criação de diferentes tipos de conta
- **Método Main:** Demonstração completa do sistema
- **Tipos Primitivos:** double, int para valores monetários
- **Operadores Aritméticos:** Cálculos de taxas e operações bancárias
- **Formatação de Saída:** Mensagens padronizadas para operações

### Arquivos
- `main.java`
- `Conta.java` (interface)
- `ContaBancaria.java` (classe abstrata)
- `ContaCorrente.java`
- `ContaPoupanca.java`
- `TipoConta.java` (enum)

## 🔧 Desafio 6
**Descrição:** Sistema avançado de cadastro de ninjas com funcionalidades completas de CRUD utilizando generics, collections e algoritmos de ordenação. Implementa um menu interativo robusto com operações de busca, ordenação e manipulação de dados em estruturas dinâmicas.

### Conceitos Aplicados
- **Generics:** Classe ListaDeNinjas<T> para type safety
- **Collections Framework:** LinkedList para estrutura de dados dinâmica
- **Algoritmos de Ordenação:** Comparator e sort() para ordenação customizada
- **Comparators:** Comparator.comparing() e comparingInt() para diferentes critérios
- **Expressões Lambda:** Uso implícito em comparadores
- **Busca em Coleções:** Algoritmo de busca linear com contains()
- **Manipulação de Strings:** toLowerCase() e contains() para busca case-insensitive
- **Casting de Tipos:** Cast de generics para tipos específicos
- **Separação de Responsabilidades:** Classes especializadas (Menu, ListaDeNinjas, Ninja)
- **Packages:** Organização de código em pacotes (NinjasList)
- **Entrada e Saída Avançada:** Scanner com tratamento de buffer
- **Estruturas de Controle Complexas:** Menus aninhados e validações
- **Método toString():** Sobrescrita para representação textual
- **Construtores Sobrecarregados:** Construtor padrão e parametrizado
- **Encapsulamento:** Getters e modificadores de acesso adequados
- **Operações CRUD:** Create, Read, Update, Delete completas
- **Tratamento de Referências:** Verificação de null e objetos válidos
- **Interface de Usuário:** Menu interativo com múltiplas opções
- **Modularização Avançada:** Métodos específicos para cada funcionalidade
- **Boas Práticas de Collections:** Uso adequado de LinkedList vs ArrayList

### Arquivos
- `main.java`
- `Menu.java`
- `Ninja.java`
- `ListaDeNinjas.java`

## 🎓 Objetivos Pedagógicos
Estes desafios foram desenvolvidos para demonstrar a evolução natural no aprendizado de Java:

1. **Fundamentos:** Variáveis, condicionais, entrada/saída
2. **Estruturas de Dados:** Arrays, manipulação de coleções estáticas, programação estruturada
3. **Orientação a Objetos:** Classes, herança, polimorfismo
4. **Conceitos Avançados:** Interfaces, enums, contratos
5. **Arquitetura Robusta:** Classes abstratas, hierarquias complexas, sistemas completos
6. **Programação Avançada:** Generics, collections, algoritmos de ordenação e busca

Cada desafio constrói sobre o anterior, mostrando como refatorar e melhorar o código conforme novos conceitos são aprendidos.

**Desenvolvido para fins educacionais** 📚
