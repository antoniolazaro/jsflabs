package com.pilotojsf.managedbean.dia2.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import com.pilotojsf.validator.custom.Primo;

public class AlunoModel implements Serializable{
	
	private static final long serialVersionUID = 130510086061152700L;
	
	@Primo
	@NotNull(message="Valor codigo não pode ser null...")
	private Long codigo;
	
	private String nome;
	private String cidade;
	private Date dataNascimento;
	@AssertTrue
	private Boolean testeAssertTrue;
	@AssertFalse(message="Valor incorreto")
	private Boolean testeAssertFalse;
	@DecimalMin(inclusive=true,value="10")
	private Integer decimalMin;
	@DecimalMax(value="20")
	private Integer decimalMax;
	
	private String email;
	private Date dataInicioCurso;
	private Date dataFimCurso;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Integer getDecimalMin() {
		return decimalMin;
	}
	public void setDecimalMin(Integer decimalMin) {
		this.decimalMin = decimalMin;
	}
	public Integer getDecimalMax() {
		return decimalMax;
	}
	public void setDecimalMax(Integer decimalMax) {
		this.decimalMax = decimalMax;
	}
	public Boolean getTesteAssertTrue() {
		return testeAssertTrue;
	}
	public void setTesteAssertTrue(Boolean testeAssertTrue) {
		this.testeAssertTrue = testeAssertTrue;
	}
	public Boolean getTesteAssertFalse() {
		return testeAssertFalse;
	}
	public void setTesteAssertFalse(Boolean testeAssertFalse) {
		this.testeAssertFalse = testeAssertFalse;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataInicioCurso() {
		return dataInicioCurso;
	}
	public void setDataInicioCurso(Date dataInicioCurso) {
		this.dataInicioCurso = dataInicioCurso;
	}
	public Date getDataFimCurso() {
		return dataFimCurso;
	}
	public void setDataFimCurso(Date dataFimCurso) {
		this.dataFimCurso = dataFimCurso;
	}
	
}
