package com.pinturas.galeria.Tipopago.exception;

public class TipopagoNotFoundException extends RuntimeException {

    public TipopagoNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
