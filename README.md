# 📚 Cadastro de Livros em Java

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sinthianmarques)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Project](https://img.shields.io/badge/-Project-blueviolet?style=for-the-badge)]()

> Aplicação simples em Java desenvolvida para cadastrar e exibir informações sobre livros.  
> Ideal para praticar os pilares da **Programação Orientada a Objetos (POO)**, manipulação de dados via console e uso de coleções em Java.

---

##  📑   Índice

- [Visão Geral](#-visão-geral)
- [strutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#️-como-executar)
- [Exemplo de Execução](#-exemplo-de-execução)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Funcionalidades](#-funcionalidades)
- [Como Contribuir](#-como-contribuir)
- [Licença](#-licença)

---

## 💡 Visão Geral

Este projeto foi criado com o objetivo de reforçar os conceitos de classes, objetos e métodos em Java.  
O programa permite ao usuário:

➟    Cadastrar livros com título, autor e ano de publicação  
➟    Visualizar todos os livros cadastrados  
➟    Navegar por um menu simples e intuitivo no terminal

---

## 📂 Estrutura do Projeto

O projeto é composto por duas classes principais:

### `Livro.java`

Classe que representa um livro, com as seguintes características:

**Propriedades:**
- `titulo` (String): O título do livro
- `autor` (String): O autor do livro
- `ano` (int): O ano de publicação

**Métodos:**
- `Livro(String titulo, String autor, int ano)`: Construtor
- `getTitulo()`, `getAutor()`, `setAno(int ano)`: Getters e setters
- `exibirInfo()`: Exibe as informações do livro no console

---

### 📝 `Cadastro.java`

Classe principal com o menu de interação com o usuário.  
Ela gerencia a entrada de dados, armazena os livros em uma lista e controla o fluxo do programa.

**Funcionalidades:**
- Cadastrar novos livros
- Exibir livros cadastrados
- Encerrar o programa

---

## ⚙️ Como Executar

### Clonando o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

### Compilando e executando via terminal

```bash
javac Cadastro.java Livro.java
java Cadastro
```

Ou, se preferir, abra o projeto em uma IDE como Eclipse ou IntelliJ.

---

## 💻  Exemplo de Execução

```
Cadastro de Livros
1. Cadastrar livros
2. Exibir livros cadastrados
3. Sair

Escolha uma Opção: 1
Digite o título do livro: O Senhor dos Anéis
Digite o autor do livro: J.R.R. Tolkien
Digite o ano de publicação: 1954
Livro cadastrado com sucesso.

Escolha uma Opção: 2

Livros cadastrados:
Título: O Senhor dos Anéis
Autor: J.R.R. Tolkien
Ano: 1954
```

---

## 🔧 Tecnologias Utilizadas

- Java 8+
- `ArrayList` para armazenar os livros
- `Scanner` para entrada de dados via console

---

## 🔒Funcionalidades

- Cadastro de livros com dados básicos
- Visualização dos livros inseridos
- Navegação por menu com opções simples
- Código limpo e didático — ideal para iniciantes

---

##  🚩 Como Contribuir

Contribuições são super bem-vindas!  
Se você tiver sugestões, melhorias ou correções:

1. Crie uma [issue](https://github.com/seu-usuario/seu-repositorio/issues)
2. Faça um fork e envie um Pull Request

---

## 📝 Licença

Distribuído sob a Licença MIT.  
Consulte `LICENSE.md` para mais informações.

---

_"Grandes projetos começam com pequenos cadastros."_  
Por [Sinthian Marques ](https://github.com/seu-usuario)
