package com.verea.medico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.verea.medico.model.Paciente;
import com.verea.medico.repository.PacienteRepo;

public class PacienteServiceImplements implements PacienteService {

	@Autowired
	PacienteRepo pacienteRepo;
	
	@Override
	public void incluir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return pacienteRepo.findAll();
	}

	@Override
	public Paciente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return pacienteRepo.listByNome(nome);
	}

}
