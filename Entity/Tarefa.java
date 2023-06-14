package com.example.gerenciamentodetarefas.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import com.example.gerenciamentodetarefas.Entity.Enum.Prioridade;
import com.example.gerenciamentodetarefas.Entity.Enum.Status;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {

        private Long id;
        private String titulo;
        private String descricao;
        private LocalDateTime dataDeVencimento;
        private Status status;
        private Prioridade prioridade;
        private String responsavel;
        private LocalDateTime dataDaCriacao;
        private LocalDateTime dataDaConclusão;

}

