package com.verea.medico.model;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Timestamp data ;
	private String numeroProntuario;
	private String nome;
	private String nascimento;
	private String sexo;
	private String estado_civil;
	private String filhos;
	private String local_nascimento;
	private String rg;
	private String cpf;
	private String enviado_por;
	private String endereco_res;
	private String bairro_res;
	private String cidade_res;
	private String estado_res;
	private String cep_res;
	private String fone_res;
	private String celular;
	private String profissao;
	private String cargo;
	private String atividade;
	private String empresa;
	private String endereco_com;
	private String cidade_com;
	private String estado_com;
	private String cep_com;
	private String fone_com;
	private String motivo;
	private String email;
	private String numeroCartao;
	private String cod_convenio;
	private Integer codigo_convenio_plano;
	private Integer codigo_paciente;
	private String documento ;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public String getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getFilhos() {
		return filhos;
	}
	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}
	public String getLocal_nascimento() {
		return local_nascimento;
	}
	public void setLocal_nascimento(String local_nascimento) {
		this.local_nascimento = local_nascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEnviado_por() {
		return enviado_por;
	}
	public void setEnviado_por(String enviado_por) {
		this.enviado_por = enviado_por;
	}
	public String getEndereco_res() {
		return endereco_res;
	}
	public void setEndereco_res(String endereco_res) {
		this.endereco_res = endereco_res;
	}
	public String getBairro_res() {
		return bairro_res;
	}
	public void setBairro_res(String bairro_res) {
		this.bairro_res = bairro_res;
	}
	public String getCidade_res() {
		return cidade_res;
	}
	public void setCidade_res(String cidade_res) {
		this.cidade_res = cidade_res;
	}
	public String getEstado_res() {
		return estado_res;
	}
	public void setEstado_res(String estado_res) {
		this.estado_res = estado_res;
	}
	public String getCep_res() {
		return cep_res;
	}
	public void setCep_res(String cep_res) {
		this.cep_res = cep_res;
	}
	public String getFone_res() {
		return fone_res;
	}
	public void setFone_res(String fone_res) {
		this.fone_res = fone_res;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getEndereco_com() {
		return endereco_com;
	}
	public void setEndereco_com(String endereco_com) {
		this.endereco_com = endereco_com;
	}
	public String getCidade_com() {
		return cidade_com;
	}
	public void setCidade_com(String cidade_com) {
		this.cidade_com = cidade_com;
	}
	public String getEstado_com() {
		return estado_com;
	}
	public void setEstado_com(String estado_com) {
		this.estado_com = estado_com;
	}
	public String getCep_com() {
		return cep_com;
	}
	public void setCep_com(String cep_com) {
		this.cep_com = cep_com;
	}
	public String getFone_com() {
		return fone_com;
	}
	public void setFone_com(String fone_com) {
		this.fone_com = fone_com;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getCod_convenio() {
		return cod_convenio;
	}
	public void setCod_convenio(String cod_convenio) {
		this.cod_convenio = cod_convenio;
	}
	public Integer getCodigo_convenio_plano() {
		return codigo_convenio_plano;
	}
	public void setCodigo_convenio_plano(Integer codigo_convenio_plano) {
		this.codigo_convenio_plano = codigo_convenio_plano;
	}
	public Integer getCodigo_paciente() {
		return codigo_paciente;
	}
	public void setCodigo_paciente(Integer codigo_paciente) {
		this.codigo_paciente = codigo_paciente;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
