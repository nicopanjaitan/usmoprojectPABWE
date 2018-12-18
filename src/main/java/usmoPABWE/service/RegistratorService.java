package usmoPABWE.service;

import java.util.List;

import usmoPABWE.model.Registrator;

public interface RegistratorService {

	List<Registrator> listRegistrator();
	
	//saveOrUpdate digunakan untuk method save dan update
	Registrator saveOrUpdate (Registrator registrator);
	
	Registrator getId(Integer id);
	
	void deleteRegistrator(Integer id);
}