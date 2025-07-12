# 🛒 Sistema de Gestão de Vendas e Estoque (SGVE)

## 📌 Descrição

O SGVE (Sistema de Gestão de Vendas e Estoque) é uma aplicação desktop desenvolvida em Java, com interface gráfica construída utilizando Swing e persistência de dados via MySQL. Trata-se de um sistema voltado para o ambiente de vendas e administração de estoque, pensado especialmente para pequenos negócios ou estudos acadêmicos.

---

## 🎯 Contexto do Projeto

Este projeto nasceu durante minha formação técnica em Desenvolvimento de Sistemas. A ideia surgiu como uma maneira prática de aplicar conceitos que eu vinha estudando, como programação orientada a objetos, manipulação de banco de dados e desenvolvimento de interfaces gráficas. Escolhi desenvolver um sistema de vendas e estoque porque é um cenário muito presente no dia a dia de empresas e comércios, o que me permitiu simular um uso real.

O desenvolvimento do sistema envolveu a criação de telas para cadastro de produtos, categorias, usuários e vendas, tudo de forma conectada a um banco de dados MySQL. Também adicionei um recurso de registro de atividades (logs), onde todas as ações realizadas pelos usuários ficam armazenadas — algo que aprendi ser importante para auditoria e controle de mudanças.

---

## 📚 O que Aprendi

Durante a construção do SGVE, aprendi muito mais do que apenas escrever código. A experiência me permitiu entender melhor a estrutura de um sistema completo, desde a modelagem do banco até o empacotamento do projeto com Maven. Também passei a ver com mais clareza a importância da separação de responsabilidades, organização em camadas (como o padrão MVC) e a necessidade de tratar erros de forma adequada para garantir uma boa experiência ao usuário.

Além disso, foi a primeira vez que trabalhei com logs de atividades, algo que eu nunca tinha implementado antes, e que hoje entendo como essencial em sistemas de gestão.


## 🧪 Ferramentas

| Tecnologia | Descrição |
|------------|-----------|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) | Linguagem principal usada no desenvolvimento |
| ![Swing](https://img.shields.io/badge/Swing-%23000000?style=for-the-badge&logo=java&logoColor=white) | Biblioteca gráfica para construção da interface |
| ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white) | Banco de dados relacional |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) | Gerenciador de dependências e build |
| ![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white) | IDE utilizada durante o desenvolvimento |

### 💻 Usando o Terminal

1. Clone o repositório:
   ```bash
   git clone https://github.com/TaylorSzu/SGVE.git

2. Entre na pasta:
    ```bash
    cd SGVE

3. Compile o projeto com o Maven:
    ```bash
    mvn clean install

4. Execute a aplicação:
    ```bash
    mvn exec:java
