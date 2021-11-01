package br.com.robson.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robson.forum.controller.dto.TopicoDto;
import br.com.robson.forum.modelo.Curso;
import br.com.robson.forum.modelo.Topico;


@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico,topico,topico));
	}
}
