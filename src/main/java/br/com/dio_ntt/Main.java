package br.com.dio_ntt;

import br.com.dio_ntt.exception.GameIsFinishedException;
import br.com.dio_ntt.exception.LetterAlreadyInputtedException;

import br.com.dio_ntt.model.HangmanGame;

import java.util.Scanner;


public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame("ESPANHA");
        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Tente adivinhar a palavra secreta.");

        while (!hangmanGame.isGameFinished()) {
            System.out.println("\n--- Jogo da Forca ---");
            System.out.println("Palavra secreta: " + hangmanGame.getWordMasked());
            System.out.println("Chances restantes: " + hangmanGame.getRemainingChances());
            System.out.println("Letras usadas: " + hangmanGame.getUsedChars());

            System.out.println("\nSelecione uma das opções:");
            System.out.println("1 - Informar uma letra");
            System.out.println("2 - Verificar status do jogo");
            System.out.println("3 - Sair do jogo");
            System.out.print("> ");

            String inputLine = scanner.nextLine();
            int option;
            try {
                option = Integer.parseInt(inputLine);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                continue;
            }

            switch (option) {
                case 1 -> inputCharacter(hangmanGame);
                case 2 -> showGameStatus(hangmanGame);
                case 3 -> {
                    System.out.println("Saindo do jogo. Até mais!");
                    return;
                }
                default -> System.out.println("Opção inválida. Por favor, selecione 1, 2 ou 3.");
            }
        }

        if (hangmanGame.isGameWon()) {
            System.out.println("\nParabéns! Você ganhou! A palavra era: " + hangmanGame.getWord());
        } else {
            System.out.println("\nQue pena! Você perdeu! A palavra era: " + hangmanGame.getWord());
        }
        scanner.close();
    }

    private static void showGameStatus(final HangmanGame hangmanGame) {
        System.out.println("
--- Status Atual do Jogo ---");
        System.out.println("Palavra secreta: " + hangmanGame.getWordMasked());
        System.out.println("Chances restantes: " + hangmanGame.getRemainingChances());
        System.out.println("Letras usadas: " + hangmanGame.getUsedChars());
        System.out.println("Status: " + hangmanGame.getHangmanGameStatus());
    }

    private static void inputCharacter(final HangmanGame hangmanGame) {
        System.out.println("Informe uma letra:");
        System.out.print("> ");
        String line = scanner.nextLine();

        if (line.length() != 1) {
            System.out.println("Entrada inválida. Digite apenas uma letra.");
            return;
        }

        char character = line.toUpperCase().charAt(0);

        try {
            hangmanGame.inputCharacter(character);
        } catch (LetterAlreadyInputtedException ex) {
            System.out.println("Você já digitou essa letra. Tente outra.");
        } catch (GameIsFinishedException ex) {
            System.out.println("O jogo já terminou.");
        }
    }

}
