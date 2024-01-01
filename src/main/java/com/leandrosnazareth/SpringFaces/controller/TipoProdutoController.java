package com.leandrosnazareth.SpringFaces.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import com.leandrosnazareth.SpringFaces.entity.TipoProduto;

import com.leandrosnazareth.SpringFaces.repository.TipoProdutoRepository;

@Named
@ViewScoped
public class TipoProdutoController {

    private TipoProduto tipoProduto = new TipoProduto();
    private List<TipoProduto> tiposProdutos = new ArrayList<>();

    @Autowired
    private TipoProdutoRepository tipoProdutoRepository;

    public void getTiposProdutos() {
        tiposProdutos = tipoProdutoRepository.findAll();
    }
}
