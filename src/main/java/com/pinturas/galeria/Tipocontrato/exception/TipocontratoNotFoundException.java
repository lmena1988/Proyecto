package com.pinturas.galeria.Tipocontrato.exception;

public class TipocontratoNotFoundException extends RuntimeException {

    public TipocontratoNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
