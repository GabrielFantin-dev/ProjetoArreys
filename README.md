# ProjetoArreys
# 📋 Projeto Lista de Convidados

Projeto desenvolvido em **Java** com o objetivo de praticar conceitos básicos de **Programação Orientada a Objetos (POO)**, criação e manipulação de listas e utilização de métodos.

## 🎯 Objetivo

Criar um sistema simples para armazenar convidados de uma festa e realizar algumas operações com essa lista, como:

* Adicionar convidados;
* Listar os nomes dos convidados;
* Exibir uma mensagem;
* Verificar se determinado convidado está presente na lista.

## 📂 Estrutura dos arquivos

### `Lista.java`

Classe responsável por executar o programa através do método `main`.

Neste arquivo são realizadas as seguintes ações:

* Criação do `ArrayList`;
* Adição dos convidados;
* Criação de um objeto da classe `ListaDeConvidados`;
* Chamada dos métodos da classe;
* Verificação da existência de um convidado.

### `ListaDeConvidados.java`

Classe responsável pelas funcionalidades relacionadas à lista de convidados.

Contém os seguintes métodos:

#### `mostrarMensagem()`

Exibe uma mensagem no console:

```text
Lista de Convidados da Festa!
```

#### `listarNomes(ArrayList<String> lista)`

Percorre a lista de convidados utilizando um `for` e exibe cada nome no console.

#### `verificarConvidado(ArrayList<String> lista, String nomeProcurado)`

Procura um nome dentro da lista e retorna:

* `true` → caso o convidado esteja na lista;
* `false` → caso o convidado não esteja na lista.

A comparação é feita utilizando `equalsIgnoreCase()`, permitindo encontrar o nome independentemente de letras maiúsculas ou minúsculas.

## 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

* Classes e objetos;
* Método `main`;
* Métodos `public`;
* `ArrayList`;
* Generics (`ArrayList<String>`);
* Laço de repetição `for`;
* Estrutura condicional `if`;
* Tipo `boolean`;
* `return`;
* Criação de objetos utilizando `new`;
* Passagem de parâmetros para métodos;
* `equalsIgnoreCase()`;
* Organização de código em diferentes classes.

## 💻 Exemplo de saída

Ao executar o programa, o console apresenta:

```text
Lista de Convidados da Festa!
Alice
Bob
Charlie
Alice está na lista? true
```

## 🛠️ Tecnologias utilizadas

* **Java**
* **Visual Studio Code**
* **Git**
* **GitHub**

---

📚 **Projeto desenvolvido para fins de estudo e prática de Java.**