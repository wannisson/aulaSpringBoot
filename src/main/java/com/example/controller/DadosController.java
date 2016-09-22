package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Dados;
import com.example.repository.DadosRepository;

@Controller
public class DadosController {
	
	@Autowired
	DadosRepository dadosRepository;
	
	@GetMapping("/contador")
	public String contador(@RequestParam Integer id, Model model){
		Dados dado = dadosRepository.findOne(id);
		if(dado == null){
			dado = new Dados();
			dado.setId(id);
			dado.setQtd(0);
		}
		model.addAttribute("dado1", dado.getQtd());
		return "contador";
	}
}
