CREATE TABLE paciente (
	data TIMESTAMP,
	numeroProntuario VARCHAR(25) NOT NULL,
	nome VARCHAR(80),
	nascimento TIMESTAMP,
	sexo VARCHAR(1),
	estado_civil VARCHAR(20),
	filhos VARCHAR(2),
	local_nascimento VARCHAR(80),
	rg VARCHAR(20),
	cpf VARCHAR(20),
	enviado_por VARCHAR(80),
	endereco_res VARCHAR(80),
	bairro_res VARCHAR(40),
	cidade_res VARCHAR(40),
	estado_res VARCHAR(2),
	cep_res VARCHAR(8),
	fone_res VARCHAR(50),
	celular VARCHAR(20),
	profissao VARCHAR(40),
	cargo VARCHAR(40),
	atividade VARCHAR(80),
	empresa VARCHAR(50),
	endereco_com VARCHAR(80),
	cidade_com VARCHAR(40),
	estado_com VARCHAR(2),
	cep_com VARCHAR(8),
	fone_com VARCHAR(50),
	motivo VARCHAR(16777216),
	email VARCHAR(100),
	numeroCartao VARCHAR(25),
	cod_convenio VARCHAR(255),
	codigo_convenio_plano INTEGER,
	codigo_paciente INTEGER NOT NULL,
	documento VARCHAR(16777216),
	CONSTRAINT SYS_PK_10578 PRIMARY KEY (codigo_paciente)
) ;
CREATE UNIQUE INDEX SYS_IDX_10480 ON paciente (codigo_paciente) ;
CREATE UNIQUE INDEX SYS_IDX_PACIENTE_CODIGO_PACIENTE_10568 ON paciente (codigo_paciente) ;
CREATE UNIQUE INDEX SYS_IDX_PACIENTE_NUMEROPRONTUARIO_10573 ON paciente (numeroProntuario) ;


CREATE TABLE Agendamento (
	codigo_agenda INTEGER NOT NULL,
	numeroProntuario VARCHAR(255),
	FoneContato VARCHAR(255),
	DataAgendada TIMESTAMP,
	Horario TIMESTAMP,
	Convenio VARCHAR(255),
	Retorno BOOLEAN DEFAULT 0,
	NovoPaciente BOOLEAN DEFAULT 0,
	Observacao VARCHAR(16777216),
	NomePaciente VARCHAR(100),
	Reagendamento BOOLEAN DEFAULT 0,
	StatusAgendamento VARCHAR(50),
	codigo_convenio_plano INTEGER,
	CodigoMedico INTEGER,
	codigo_paciente INTEGER,
	CONSTRAINT SYS_PK_10522 PRIMARY KEY (codigo_agenda)
) ;
CREATE INDEX AGENDAMENTO_AGENDAMENTOCODIGO_PACIENTE ON Agendamento (numeroProntuario) ;
CREATE INDEX AGENDAMENTO_CODIGOMEDICO ON Agendamento (CodigoMedico) ;
CREATE INDEX AGENDAMENTO_CODIGO_PACIENTE ON Agendamento (codigo_paciente) ;
CREATE INDEX AGENDAMENTO_DATAAGENDADA ON Agendamento (DataAgendada) ;
CREATE INDEX AGENDAMENTO_HORARIO ON Agendamento (Horario) ;
CREATE INDEX AGENDAMENTO_NOMEPACIENTE ON Agendamento (NomePaciente) ;
CREATE UNIQUE INDEX SYS_IDX_10376 ON Agendamento (codigo_agenda) ;


CREATE TABLE Faturamento (
	codigo_faturamento INTEGER NOT NULL,
	numeroCartao VARCHAR(255),
	numeroProntuario VARCHAR(255),
	DataAtendimento TIMESTAMP,
	GuiaConsulta VARCHAR(255),
	NumCobranca VARCHAR(255),
	DataNF TIMESTAMP,
	DataEntrega TIMESTAMP,
	RetornoFaturamento TIMESTAMP,
	DataPagamento TIMESTAMP,
	Status VARCHAR(25),
	Obs VARCHAR(16777216),
	codigo_consulta INTEGER DEFAULT 0,
	novo BOOLEAN DEFAULT true,
	CONSTRAINT SYS_PK_10556 PRIMARY KEY (codigo_faturamento)
) ;
CREATE INDEX FATURAMENTO_CODIGO_CONSULTA ON Faturamento (codigo_consulta) ;
CREATE INDEX FATURAMENTO_NUMEROPRONTUARIO ON Faturamento (numeroProntuario) ;
CREATE UNIQUE INDEX SYS_IDX_10428 ON Faturamento (codigo_faturamento) ;


CREATE TABLE consulta (
	codigo_consulta INTEGER NOT NULL,
	numeroProntuario VARCHAR(255),
	dataAtendimento TIMESTAMP,
	codigoConvenio VARCHAR(3),
	numeroGuia VARCHAR(30),
	observacoes VARCHAR(16777216),
	Retorno BOOLEAN DEFAULT 0,
	codigo_convenio_plano INTEGER,
	codigo_paciente INTEGER,
	codigo_agenda INTEGER DEFAULT 0,
	CONSTRAINT SYS_PK_10530 PRIMARY KEY (codigo_consulta)
) ;
CREATE INDEX CONSULTA_CODIGO_PACIENTE ON consulta (codigo_paciente) ;
CREATE UNIQUE INDEX SYS_IDX_10388 ON consulta (codigo_consulta) ;
CREATE UNIQUE INDEX SYS_IDX_CONSULTA_CODIGO_AGENDA_10526 ON consulta (codigo_agenda) ;


CREATE TABLE convenio (
	codigoConvenio VARCHAR(5) NOT NULL,
	NomeConvenio VARCHAR(50),
	TipoConvenio VARCHAR(25),
	CONSTRAINT SYS_PK_10534 PRIMARY KEY (codigoConvenio)
) ;
CREATE UNIQUE INDEX SYS_IDX_10393 ON convenio (codigoConvenio) ;


CREATE TABLE convenio_plano (
	codigo_convenio_plano INTEGER NOT NULL,
	codigoConvenio VARCHAR(5),
	NomePlano VARCHAR(50),
	Ativo BOOLEAN DEFAULT 0,
	CONSTRAINT SYS_PK_10538 PRIMARY KEY (codigo_convenio_plano)
) ;
CREATE INDEX CONVENIO_PLANO_CODIGOCONVENIO ON convenio_plano (codigoConvenio) ;
CREATE UNIQUE INDEX SYS_IDX_10399 ON convenio_plano (codigo_convenio_plano) ;


CREATE TABLE medico (
	Codigo INTEGER NOT NULL,
	Nome VARCHAR(50),
	CONSTRAINT SYS_PK_10564 PRIMARY KEY (Codigo)
) ;
CREATE UNIQUE INDEX SYS_IDX_10443 ON medico (Codigo) ;



CREATE TABLE prontuario (
	codigo_prontuario INTEGER NOT NULL,
	codigo_paciente INTEGER,
	Medico VARCHAR(255),
	Horario VARCHAR(255),
	Valores VARCHAR(255),
	Motivo VARCHAR(16777216),
	Diagnostico VARCHAR(16777216),
	CID10 VARCHAR(10),
	observacao VARCHAR(16777216),
	psicoterapia BOOLEAN DEFAULT 0,
	psiquiatria BOOLEAN DEFAULT 0,
	pa VARCHAR(20),
	pulso VARCHAR(20),
	pesoatual NUMERIC(128,0) DEFAULT 0,
	IMC INTEGER,
	examesComplementares VARCHAR(16777216),
	Fumo BOOLEAN DEFAULT 0,
	Cafe BOOLEAN DEFAULT 0,
	Alcool BOOLEAN DEFAULT 0,
	Drogas BOOLEAN DEFAULT 0,
	Remedios VARCHAR(255),
	Hist_familiar VARCHAR(16777216),
	CONSTRAINT SYS_PK_10583 PRIMARY KEY (codigo_prontuario)
) ;
CREATE UNIQUE INDEX SYS_IDX_10505 ON prontuario (codigo_prontuario) ;














