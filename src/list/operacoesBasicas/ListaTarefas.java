package Santander.Collections.src.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;


    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void acidionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Obter número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.acidionarTarefa("Tarefa 1");
        listaTarefas.acidionarTarefa("Tarefa 2");
        listaTarefas.acidionarTarefa("Tarefa 3");
        listaTarefas.acidionarTarefa("Tarefa 4");

        System.out.println("Obter número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("Obter número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();




    }
}
