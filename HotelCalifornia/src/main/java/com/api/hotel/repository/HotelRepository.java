package com.api.hotel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.hotel.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer>{
	
	//Listar todos os hoteis
	List<Hotel> findAll();
	//Pesquisar por Matrícula
	Hotel findByMatricula(int matricula);	
	//Remover hotel
	void delete(Hotel hotel);	
	//Criar e Alterar Hotel
	//Hotel save(Hotel hotel);
	<HotelTemp extends Hotel> HotelTemp save(HotelTemp hotel);

}
