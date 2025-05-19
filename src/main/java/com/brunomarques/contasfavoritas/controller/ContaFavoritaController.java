package com.brunomarques.contasfavoritas.controller;


import com.brunomarques.contasfavoritas.model.ContaFavorita;
import com.brunomarques.contasfavoritas.service.ContaFavoritaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas-favoritas")
public class ContaFavoritaController {

    @Autowired
    private ContaFavoritaService service;

    @GetMapping
    public List<ContaFavorita> listarTodas() {
        return service.listarTodas();

    }

    @GetMapping("/{id}")
    public ContaFavorita buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);

    }

    @PostMapping
    public ResponseEntity<ContaFavorita>criarContaFavorita(@RequestBody ContaFavorita contaFavorita) {
        contaFavorita = service.criarContaFavorita(contaFavorita);
        ContaFavorita contaSalva = new ContaFavorita();
        return ResponseEntity.status(HttpStatus.CREATED).body(contaSalva);

        }
    @PostMapping
    public ContaFavorita salvar(@RequestBody @Valid ContaFavorita conta) {
        return service.salvar(conta);

    }

    @PutMapping("/{id}")
    public ContaFavorita atualizar(@PathVariable Long id, @RequestBody @Valid ContaFavorita conta) {
        return service.atualizar(id, conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}



