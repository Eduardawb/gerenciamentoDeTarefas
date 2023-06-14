package com.example.gerenciamentodetarefas.Controller;

import com.example.gerenciamentodetarefas.Entity.Tarefa;
import com.example.gerenciamentodetarefas.Service.tarefa.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class tarefaController {

    @Autowired
private TarefaService tarefaService;

    @GetMapping("tarefas")
public List<Tarefa> tarefaList(){
    return  tarefaService.buscarTarefas();


    }
@PostMapping("tarefa")
    public Tarefa salvarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.adicionarTarefa(tarefa);
}
@PostMapping("tarefa/atualizar/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizarTarefa(id, tarefa);

    }

}





