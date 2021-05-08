package com.api.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.hotel.model.Hotel;
import com.api.hotel.repository.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	//ações
	@Autowired
	private HotelRepository acoes;
	//Listar Hoteis
	@RequestMapping(value="/hotel", method=RequestMethod.GET)
	public @ResponseBody List<Hotel> listar(){
		return acoes.findAll();
	}
	
	//Cadastrar Hoteis
	@RequestMapping(value="/hotel", method=RequestMethod.POST)
	public @ResponseBody Hotel cadastrar(@RequestBody Hotel hotel){
		return acoes.save(hotel);
	}
	
	//Filtrar Hoteis
	@RequestMapping(value="/hotel/{matricula}", method=RequestMethod.GET)
	public @ResponseBody Hotel filtrar(@PathVariable Integer matricula){
		return acoes.findByMatricula(matricula);
	}
	
	//Alterar Hoteis
	@RequestMapping(value="/hotel", method=RequestMethod.PUT)
	public @ResponseBody Hotel alterar(@RequestBody Hotel hotel){
		return acoes.save(hotel);
	}
	
	//Filtrar Hoteis
	@RequestMapping(value="/hotel/{matricula}", method=RequestMethod.DELETE)
	public @ResponseBody void remover(@PathVariable Integer matricula){
		Hotel hotel = filtrar(matricula);
		this.acoes.delete(hotel);
	}

}
