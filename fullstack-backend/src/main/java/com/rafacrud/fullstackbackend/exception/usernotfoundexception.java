package com.rafacrud.fullstackbackend.exception;

public class usernotfoundexception extends RuntimeException {
    public usernotfoundexception(Long id) {
        super("Não foi possível encontrar um usuário com id " + id);
    }
}
