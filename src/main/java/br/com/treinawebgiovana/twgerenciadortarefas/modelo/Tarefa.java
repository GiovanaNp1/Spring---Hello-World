package br.com.treinawebgiovana.twgerenciadortarefas.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tar_tarefas" )
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tar_id")
	private Long id;
	
	@Column(name = "tar_titulo",length = 70, nullable = false )
	private String titulo;
	
	@Column(name =  "tar_descricao", length = 100, nullable = true)
	private String descricao;
	
	@Column(name = "tar_data_expedicao", nullable = false)
	private Date dtaExpiracao;
	
	@Column(name = "tar_concluida", nullable = false)
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
