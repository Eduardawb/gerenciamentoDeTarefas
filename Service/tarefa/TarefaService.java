package com.example.gerenciamentodetarefas.Service.tarefa;

import com.example.gerenciamentodetarefas.Entity.Tarefa;
import com.example.gerenciamentodetarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Controller
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    public List<Tarefa> buscarTarefas(){
        return  tarefaRepository.buscarTarefas();
    }
    public Tarefa buscarTarefaPorId (Long id) {
        return tarefaRepository.buscarTarefaPorId(id);
}
    public Tarefa atualizarTarefa(long id, Tarefa tarefa){
        return  tarefaRepository.atualizarTarefa(id, tarefa);
    }
    public Tarefa adicionarTarefa(Tarefa tarefa){
        return tarefaRepository.adicionarTarefa(tarefa);
    }
}
