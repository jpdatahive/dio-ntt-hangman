# Jogo da Forca (Hangman Game)

Este é um pequeno projeto de um jogo da forca simples, desenvolvido em Java.

## Funcionalidades

*   Adivinhe a palavra secreta letra por letra.
*   Controle de chances restantes.
*   Exibição de letras já utilizadas.
*   Mensagens claras para o usuário sobre o status do jogo e entradas inválidas.

## Como Compilar e Rodar

Este projeto utiliza Gradle para gerenciamento de dependências e compilação.

1. **Clone este projeto com:**
    
    ```bash
    git clone git@github.com:jpdatahive/dio-ntt-hangman.git
   ```

2. **Navegue até o diretório raiz do projeto:**

    ```bash
    cd \dio-ntt-hangman
    ```

3. **Compile o projeto usando Gradle:**

    ```bash
    ./gradlew build
    ```

4. **Execute o jogo:**

    ```bash
    java -jar build/libs/dio-ntt-hangman.jar
    ```
    *(Nota: O nome exato do arquivo .jar pode variar ligeiramente dependendo da versão do Gradle ou configurações do build.gradle.kts. Verifique o diretório `build/libs` para o nome correto.)*

## Como Jogar

1.  Ao iniciar o jogo, você verá a palavra secreta mascarada (com `_` para cada letra não descoberta).
2.  O jogo apresentará um menu com as seguintes opções:
    *   `1 - Informar uma letra`: Digite `1` e pressione Enter. Em seguida, digite uma letra e pressione Enter para tentar adivinhar.
    *   `2 - Verificar status do jogo`: Digite `2` e pressione Enter para ver a palavra atual, chances restantes, letras usadas e o status geral do jogo.
    *   `3 - Sair do jogo`: Digite `3` e pressione Enter para encerrar o jogo.
3.  Se você adivinhar uma letra corretamente, ela será revelada na palavra mascarada.
4.  Se você adivinhar uma letra incorretamente, perderá uma chance.
5.  O jogo termina quando você adivinha a palavra completa (vitória) ou quando suas chances acabam (derrota).

## Tecnologias Utilizadas

*   Java
*   Gradle
