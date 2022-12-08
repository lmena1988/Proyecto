package com.pinturas.galeria.Incorporacion.exception;

public class IncorporacionNotFoundException extends RuntimeException {

    public IncorporacionNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
