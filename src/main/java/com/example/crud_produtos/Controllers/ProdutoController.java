package com.example.crud_produtos.Controllers;

import com.example.crud_produtos.Entities.ProdutoEntity;
import com.example.crud_produtos.Services.Abstractions.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Faz com que todos os métodos retornem um Json automaticamente
@RestController
@RequestMapping("/produtos") // Define a rota base
public class ProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> post()
    {
      return  ResponseEntity.ok(produtoService.findAll());
    }

    @PostMapping
    public ResponseEntity post(@Validated @RequestBody ProdutoEntity produto)
    {
        produtoService.save(produto);

        return ResponseEntity.ok(produto);
    }


    @PutMapping("")
    public ResponseEntity put(@RequestParam Long id,  @RequestBody ProdutoEntity produto)
    {
        produtoService.update(produto);

        return ResponseEntity.ok(produto);
    }


    @DeleteMapping
    public ResponseEntity delete(@RequestParam Long id,  @RequestBody ProdutoEntity produto)
    {
        produtoService.update(produto);

        return ResponseEntity.ok(produto);
    }


}
