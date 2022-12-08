package com.pinturas.galeria.Precio.exception;

public class PrecioNotFoundException extends RuntimeException {

    public PrecioNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
