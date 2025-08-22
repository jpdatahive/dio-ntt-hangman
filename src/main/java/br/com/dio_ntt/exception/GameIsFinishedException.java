package br.com.dio_ntt.exception;

public class GameIsFinishedException extends RuntimeException {

    public GameIsFinishedException(String message) {
        super(message);
    }

}
