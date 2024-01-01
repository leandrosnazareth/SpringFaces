package com.leandrosnazareth.SpringFaces.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leandrosnazareth.SpringFaces.entity.TipoProduto;

@Repository
public interface TipoProdutoRepository  extends JpaRepository<TipoProduto, Long>{
    
}
