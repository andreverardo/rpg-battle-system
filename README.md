# ⚔️ RPG Battle System

Sistema de batalha por turnos desenvolvido em **Java**, construído como laboratório prático para aplicação de **Engenharia de Software**, **Programação Orientada a Objetos (POO)** e **Clean Code**.

## 🎯 Objetivo do Projeto
O propósito deste projeto não é apenas criar um jogo de console, mas sim demonstrar a capacidade de projetar um sistema modular e sustentável. O foco principal está na separação de responsabilidades, baixo acoplamento e na utilização de recursos nativos do Java para resolver problemas reais de arquitetura.

## ⚙️ Arquitetura e Boas Práticas Aplicadas

- **Princípios SOLID (SRP):** Separação rigorosa entre a lógica de domínio/negócio (`CombatEngine`, `Character`) e a camada de apresentação (`ConsoleUi`). O motor do jogo não interage diretamente com o terminal.
- **Internacionalização (i18n):** Implementação de sistema multi-idioma (Português e Inglês) utilizando a API nativa `java.util.ResourceBundle` e `Locale`, injetada dinamicamente via interface.
- **Design Patterns:** Utilização do padrão *Factory* (`EnemyFactory`) para encapsular a complexidade da geração aleatória de oponentes.
- **Pilares da POO:**
    - **Composição:** Entidades não são apenas heranças secas; um `Character` possui (has-a) uma `Weapon` e uma `CharacterClass`.
    - **Abstração e Herança:** Classes base abstratas garantindo o contrato para instâncias específicas (Warrior, Wizard, Dagger, Sword).
    - **Encapsulamento e Polimorfismo:** Proteção do estado das entidades e sobrescrita de comportamentos dinâmicos injetados via construtores limpos (uso de `super()`).
- **Performance e Concorrência:** Geração de dados aleatórios e mitigação de danos estruturadas com `ThreadLocalRandom` em vez da classe padrão genérica.

## 🚀 Tecnologias Utilizadas
- **Linguagem:** Java (JDK 26)
- **Paradigma:** Orientação a Objetos
- **Ferramentas:** Git, GitHub, IntelliJ IDEA (sem dependências externas de frameworks)

## 📌 Estado de Desenvolvimento

- [x] Estruturação da base arquitetural de Entidades e Armas.
- [x] Implementação do padrão Factory para sorteio aleatório de oponente.
- [x] Desacoplamento da Interface de Usuário (ConsoleUi) do Domínio (CombatEngine).
- [x] Suporte Multi-idioma (i18n) configurado.
- [ ] **(Próximo passo)** Menu interativo para criação de personagem do jogador (nome e classe).
- [ ] Mecânica completa de combate por turnos com mitigação dinâmica de danos.

## 💻 Como Executar o Projeto

1. Clone este repositório na sua máquina local.
2. Abra a pasta do projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, etc.).
3. Garanta que a pasta `src/main/resources` esteja marcada como "Resources Root".
4. Execute a classe principal `CombatEngine` localizada no pacote `engine`.