package com.itb.tcc.Eatnow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarprodutos() {
		System.out.println("Lista de Produtos");
		return "produtos";
	}

}
