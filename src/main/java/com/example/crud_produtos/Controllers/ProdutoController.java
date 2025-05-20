package com.example.crud_produtos.Controllers;

import com.example.crud_produtos.Entities.ProdutoEntity;
import com.example.crud_produtos.Exceptions.ProdutoException;
import com.example.crud_produtos.Services.Abstractions.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoEntity> getById(@PathVariable Long id)
    {
        try{
           var produto = produtoService.findById(id);
            return ResponseEntity.ok(produto);
        } catch (ProdutoException e) {
            ResponseEntity.badRequest();
        } catch (Exception e) {
            ResponseEntity.badRequest();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity post(@Validated @RequestBody ProdutoEntity produto)
    {
        produtoService.save(produto);

        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity put(@PathVariable Long id,  @RequestBody ProdutoEntity produto)
    {
        try {
            produtoService.update(id, produto);

            return ResponseEntity.ok(produto);
        } catch (ProdutoException e) {
            ResponseEntity.badRequest();
        } catch (Exception e) {
            ResponseEntity.badRequest();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
             produtoService.delete(id);

            return ResponseEntity.ok(
                    new String(" Produto deletado com sucesso"));
        } catch (ProdutoException e) {
            ResponseEntity.badRequest();
        } catch (Exception e) {
            ResponseEntity.badRequest();
        }
        return ResponseEntity.notFound().build();
    }

}
