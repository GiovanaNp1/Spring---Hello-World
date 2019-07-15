package br.com.treinawebgiovana.twgerenciadorterefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinawebgiovana.twgerenciadortarefas.modelo.Tarefa;

public interface repositorioTarefa extends JpaRepository<Tarefa, Long>{

}
