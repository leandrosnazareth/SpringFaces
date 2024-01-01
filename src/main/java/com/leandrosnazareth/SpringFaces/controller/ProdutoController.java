package com.leandrosnazareth.SpringFaces.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.leandrosnazareth.SpringFaces.entity.Produto;
import com.leandrosnazareth.SpringFaces.repository.ProdutoRepository;

@Named
@ViewScoped
public class ProdutoController {

    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<>();

    @Autowired
    private ProdutoRepository produtoRepository;

    public String goToIndex() {
        System.out.println("Entrei goToIndex: ");
        return "home.xhtml?faces-redirect=true";
    }

    public void suaAcao() {
        // Lógica a ser executada quando o botão é pressionado
        System.out.println("Valor inserido: ");
    }

    public void findAllProdutos() {
        produtos = produtoRepository.findAll();
    }

    public void findProdutos() {
        produtos = produtoRepository.findAll();
    }

    public void save() {
        produtoRepository.save(produto);
        produto = new Produto();
        produtos = produtoRepository.findAll();
    }

    public void edit(Produto produto) {
        this.produto = produto;
    }

    public void refresh() {
        System.out.println("Passei no refesh");
        produto = new Produto();
    }

    public List<Produto> getprodutos() {
        return produtos;
    }

    public void setprodutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
