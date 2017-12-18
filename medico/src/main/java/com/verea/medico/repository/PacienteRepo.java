package com.verea.medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verea.medico.model.Paciente;

public interface PacienteRepo extends JpaRepository<Paciente, Long> {

}
