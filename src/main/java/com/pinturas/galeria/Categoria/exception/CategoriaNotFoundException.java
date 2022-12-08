package com.pinturas.galeria.Categoria.exception;

public class CategoriaNotFoundException extends RuntimeException {

    public CategoriaNotFoundException(Long id){
        super("Could not found the category with id "+ id);
    }


}
