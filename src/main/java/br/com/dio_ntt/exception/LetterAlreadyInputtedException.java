package br.com.dio_ntt.exception;

public class LetterAlreadyInputtedException extends RuntimeException{

    public LetterAlreadyInputtedException(final String message) {
        super(message);
    }
}
