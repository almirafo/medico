package com.verea.medico.service;

import java.util.List;

import com.verea.medico.model.Paciente;

public interface PacienteService {
	public  void incluir();
	public  void excluir();
	public  void alterar();
	public  List<Paciente> listar();
	public  Paciente buscar(Long id);
	public  List<Paciente> buscarPorNome(String nome);
	
}
