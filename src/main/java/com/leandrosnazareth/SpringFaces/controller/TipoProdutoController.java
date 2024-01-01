package com.leandrosnazareth.SpringFaces.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.leandrosnazareth.SpringFaces.entity.TipoProduto;
import com.leandrosnazareth.SpringFaces.repository.TipoProdutoRepository;

import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
@Getter
@Setter
public class TipoProdutoController {

    private TipoProduto tipoProduto = new TipoProduto();
    private List<TipoProduto> tipoProdutos = new ArrayList<>();

    @Autowired
    private TipoProdutoRepository tipoProdutoRepository;

    public void getTiposProdutos() {
        tipoProdutos = tipoProdutoRepository.findAll();
    }

    public void findAllTiposProdutos() {
        tipoProdutos = tipoProdutoRepository.findAll();
    }

    public void save() {
        tipoProdutoRepository.save(tipoProduto);
        tipoProduto = new TipoProduto();
        tipoProdutos = tipoProdutoRepository.findAll();
    }

    public void edit(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void refresh() {
        System.out.println("Passei no refesh");
        tipoProduto = new TipoProduto();
    }

}