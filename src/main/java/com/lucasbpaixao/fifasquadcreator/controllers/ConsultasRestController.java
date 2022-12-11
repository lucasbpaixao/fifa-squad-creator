package com.lucasbpaixao.fifasquadcreator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasbpaixao.fifasquadcreator.models.InformacoesBasicas;
import com.lucasbpaixao.fifasquadcreator.repository.InformacoesBasicasRepository;

@RestController
public class ConsultasRestController {
    
    //TODO: CRIAR CLASSE CARACTERISTICAS E MAPEAR ELA

    @Autowired
    private InformacoesBasicasRepository basicasRepository;
    
    @GetMapping(value="/todos-jogadores")
    public ResponseEntity<List<InformacoesBasicas>> getTodosJogadores(@PageableDefault(sort = "InformacoesContrato.precoFloat",direction = Sort.Direction.DESC, page = 0, size = 10) Pageable page) {
        
        List<InformacoesBasicas> jogadores = basicasRepository.findAll(page).getContent();
        return ResponseEntity.ok().body(jogadores);
    }

}
