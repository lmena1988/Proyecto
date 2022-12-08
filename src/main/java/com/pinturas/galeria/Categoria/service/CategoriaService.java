package com.pinturas.galeria.Categoria.service;

import com.pinturas.galeria.Categoria.model.Categoria;
import com.pinturas.galeria.Categoria.repository.CategoriaRepository;

import java.util.List;

public interface CategoriaService {

    public Categoria saveCategoria(Categoria categoria);
    public List<Categoria> getAllCategorias();

    public long countCA();

}
