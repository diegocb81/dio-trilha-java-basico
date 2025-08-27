# 💳 Projeto ContaBanco

Este projeto foi desenvolvido como parte do desafio de Sintaxe do curso de Java da DIO (Digital Innovation One). O objetivo é exercitar os conceitos básicos de entrada de dados, declaração de variáveis, tratamento de exceções e formatação de saída no terminal.

---

## 🧠 Descrição

O programa simula a criação de uma conta bancária via terminal. O usuário é guiado para inserir os seguintes dados:

- Número da agência (ex: `067-8`)
- Número da conta (ex: `1021`)
- Nome do titular (ex: `MARIO ANDRADE`)
- Saldo inicial (ex: `237.48`)

Após a inserção dos dados, o sistema exibe uma mensagem personalizada confirmando a criação da conta.

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **Scanner** para entrada de dados
- **Try/Catch** para tratamento de exceções
- **Locale.US** para garantir o uso do ponto como separador decimal
- **System.out.printf** para formatação da saída com duas casas decimais

---

## 📦 Estrutura do projeto

ContaBanco/ ├── src/ │   └── ContaTerminal.java └── README.md

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/diegocb81/dio-trilha-java-basico.git
   
2. Compile o projeto:
javac ContaTerminal.java

3. Execute o programa:
java ContaTerminal

4. Siga as instruções no terminal para inserir os dados da conta.
Por favor, digite o número da agência:
067-8
Por favor, digite o número da conta:
1021
Por favor, digite o nome do titular da conta:
MARIO ANDRADE
Por favor, digite o saldo da conta (use ponto como separador decimal):
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 237.48 já está disponível para saque.

⚠️ Observações
- O saldo deve ser informado com ponto como separador decimal (.), e não vírgula.
- Em caso de erro de entrada (como letras em campos numéricos), o programa exibirá uma mensagem de erro amigável.

📚 Aprendizados
Este projeto reforça os seguintes conceitos:
- Sintaxe básica do Java
- Manipulação de entrada via terminal
- Tratamento de exceções com try/catch
- Formatação de saída com printf
- Uso de Locale para controle regional de dados numéricos

🧑‍💻 Autor
Desenvolvido por Diego como parte do desafio de Sintaxe da DIO.




