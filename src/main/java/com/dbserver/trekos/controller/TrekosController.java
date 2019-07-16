package com.dbserver.trekos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dbserver.trekos.models.ProdutosModel;
import com.dbserver.trekos.repositories.AnunciarRepository;

@Controller
public class TrekosController {
	@Autowired
	AnunciarRepository anunciarRepository;
	
	@GetMapping("/anunciar")
	public String anunciar() {
		return "anunciar";
	}
	
	@PostMapping("/anunciar")
	public String novoAnunciar(ProdutosModel anunciar) {
		anunciar.setPreco(anunciar.getPreco().replace(",", "."));
		anunciarRepository.save(anunciar);
		return "redirect:/";
	}

}