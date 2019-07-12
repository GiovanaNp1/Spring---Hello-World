package br.com.treinawebgiovana.twgerenciadortarefas.modelo;

import java.util.Date;

public class Tarefa {

	private Long id;
	private String titulo;
	private String descricao;
	private Date dtaExpiracao;
	private Boolean concluida = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtaExpiracao() {
		return dtaExpiracao;
	}

	public void setDtaExpiracao(Date dtaExpiracao) {
		this.dtaExpiracao = dtaExpiracao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

}
