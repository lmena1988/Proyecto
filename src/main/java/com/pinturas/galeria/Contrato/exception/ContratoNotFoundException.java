package com.pinturas.galeria.Contrato.exception;

public class ContratoNotFoundException extends RuntimeException{

    public ContratoNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
