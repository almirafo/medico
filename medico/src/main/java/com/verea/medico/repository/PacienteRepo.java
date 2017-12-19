package com.verea.medico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verea.medico.model.Paciente;

public interface PacienteRepo extends JpaRepository<Paciente, Long> {

	List<Paciente> listByNome(String nome);
	List<Paciente> listByNomeStartingWith(String nome);
}
