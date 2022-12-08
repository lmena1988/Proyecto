package com.pinturas.galeria.Tipoventa.exception;

public class TipoventaNotFoundException extends RuntimeException {

    public TipoventaNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
