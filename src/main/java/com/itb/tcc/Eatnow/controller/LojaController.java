package com.itb.tcc.Eatnow.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.Eatnow.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarprodutos(Model model) {
       
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setNome("Máquina de lavar");
		p1.setDescricao("Máquina de lavar Brastemp 13l com painel digital");
		p1.setCodigoBarra("HFOEHFHERHK1446464741");
		p1.setPreco(3215.65);
		
		Produto p2 = new Produto();
		
		p1.setId(20l);
		p1.setNome("Micro-ondas");
		p1.setDescricao("Micro-ondas Eletrolux multiuso");
		p1.setCodigoBarra("DJFAFENAOENA646484548");
		p1.setPreco(3215.65);
		
		// Guardando os produtos no array
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		// Passando a lista de produtos para o front-end
		model.addAttribute("ListaDeProdutos", listaDeProdutos);
		
		return "produtos";
	}

}
