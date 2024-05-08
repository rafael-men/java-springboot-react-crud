package com.rafacrud.fullstackbackend.exception;

public class usernotfoundexception extends RuntimeException {
    public usernotfoundexception(Long id) {
        super("User with id " + id + " not found");
    }
}
