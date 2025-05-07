# 📚 Cadastro de Livros em Java

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sinthianmarques)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Project](https://img.shields.io/badge/-Project-blueviolet?style=for-the-badge)]()

> Aplicação simples em Java desenvolvida para cadastrar e exibir informações sobre livros.  
> Ideal para praticar os pilares da **Programação Orientada a Objetos (POO)**, manipulação de dados via console e uso de coleções em Java.

---

## ➟  Conceitos Utilizados 

- Classes e Objetos  
- Encapsulamento (private, getters e setters)  
- Construtores personalizados  
- Métodos de exibição  
- Listas com `ArrayList`  
- Entrada de dados com `Scanner`  
- Estruturas de repetição e decisão (`while`, `if-else`)

---

## ⚙️ Funcionalidades

- Cadastrar livros com título, autor e ano  
- Listar todos os livros cadastrados  
- Encerrar o programa com segurança

---

## 📁 Estrutura do Projeto

```
cadastrodelivros/
├── Livro.java        # Classe que representa um livro
└── Cadastro.java     # Classe principal com menu de interação
```

---

## 🔹Como Executar

Clone o repositório:

```bash
git clone https://github.com/SinthianMar/cadastrodelivros.git
cd cadastrodelivros
```

Compile os arquivos:

```bash
javac Livro.java Cadastro.java
```

Execute o programa:

```bash
java Cadastro
```

Também é possível abrir o projeto em uma IDE como Eclipse ou IntelliJ.

---

## 💻 Exemplo de Uso

```
=== MENU ===
1. Cadastrar livro
2. Exibir livros cadastrados
3. Sair
Escolha uma opção: 1
Digite o título do livro: O Senhor dos Anéis
Digite o autor do livro: J.R.R. Tolkien
Digite o ano de publicação: 1954
Livro cadastrado com sucesso!

=== MENU ===
1. Cadastrar livro
2. Exibir livros cadastrados
3. Sair
Escolha uma opção: 2

=== Livros Cadastrados ===
Título: O Senhor dos Anéis
Autor: J.R.R. Tolkien
Ano: 1954
```

---

## 🔧 Possíveis Melhorias

- Validação de dados (ex: ano inválido, campos em branco)  
- Organização alfabética dos livros  
- Persistência em arquivos `.txt`  
- Interface gráfica com Swing ou JavaFX  
- Integração com banco de dados
---

## 📜 Licença

Distribuído sob a Licença MIT.  
Consulte `LICENSE.md` para mais informações.

---

> _"Grandes projetos começam com pequenos cadastros."_  
Por [Sinthian Marques ](https://github.com/SinthianMar) | [LinkedIn](https://www.linkedin.com/in/sinthianmarques) | sinthianmarquesjp@gmail.com

