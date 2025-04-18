# 📚 Design Patterns Criacionais em Java

Este repositório contém exemplos práticos dos principais **Design Patterns Criacionais** utilizando a linguagem **Java**. Cada padrão é implementado com um ou mais cenários reais, visando facilitar o entendimento e a aplicabilidade no dia a dia do desenvolvimento de software.

---

## 🧠 O que são Design Patterns?

Design Patterns (Padrões de Projeto) são soluções reutilizáveis para problemas comuns encontrados durante o desenvolvimento de software. Os padrões criacionais são responsáveis por abstrair o processo de **criação de objetos**, tornando o sistema mais flexível e desacoplado.

---

## 🧱 Padrões Criacionais Implementados

### ✅ Singleton
Garante que uma classe tenha apenas **uma única instância** e fornece um ponto de acesso global a ela.

- Exemplo: Gerenciador de logs
- Exemplo: Configuração de aplicativo (AppConfig)

📂 Caminho: `singleton/`

---

### ✅ Factory Method
Define uma **interface para criação de um objeto**, mas permite que as subclasses decidam qual classe instanciar.

- Exemplo: Notificações por Email, SMS, Push
- Exemplo: Gerador de documentos (PDF, Word, Excel)

📂 Caminho: `factory_method/`

---

### ✅ Abstract Factory
Fornece uma **interface para criar famílias de objetos relacionados** sem especificar suas classes concretas.

- Exemplo: Interface gráfica com temas para Windows e Mac
- Exemplo: Repositórios para diferentes bancos (MySQL, MongoDB)

📂 Caminho: `abstract_factory/`

---

### ✅ Builder  
Separa a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção crie diferentes representações.

- Exemplo: Montagem de sanduíches com ingredientes opcionais  
- Exemplo: Montagem de e-mails com campos opcionais (cc, anexos, corpo em HTML etc.)

📂 Caminho: `builder/`

---

### ✅ Prototype  
Permite criar novos objetos clonando instâncias já existentes, sem acoplar o código às suas classes concretas.

- Exemplo: Clonagem de propostas comerciais (duplicar documentos com variações)  
- Exemplo: Clonagem de inimigos em um jogo com atributos personalizados

📂 Caminho: `prototype/`

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone git@github.com:DaniloTakeo/design_patterns_creational.git
   cd design-patterns-criacionais-java

2. Compile e execute os exemplos com sua IDE favorita

## ✍️ Autor
Desenvolvido por Danilo Takeo Kanizawa — com o objetivo de reforçar os estudos de padrões de projeto e aplicar boas práticas no desenvolvimento com Java.


