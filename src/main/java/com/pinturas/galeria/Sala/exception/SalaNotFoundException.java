package com.pinturas.galeria.Sala.exception;

public class SalaNotFoundException extends RuntimeException {

    public SalaNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
