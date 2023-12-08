package Questao4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToList {

    private static ArrayList<ToList> listTarefas = new ArrayList<>();
    private static int id = 0;
    
    private int Codigoid = 0;
    private String tarefa;
    private String categoria;
    private boolean concluida;

    public ToList(String tarefa, String categoria) {
        this.tarefa = tarefa;
        this.categoria = categoria;
        this.concluida = false;
        this.Codigoid = id++;

    }

    public static void addTarefa( ToList tarefa) {
        listTarefas.add( tarefa);
    }

    public static void removerTarefaLista(int i) {
        getListTarefas().remove(i);
    }

    public static ArrayList<ToList> getListTarefas() {
        return listTarefas;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isConcluida() {
        return concluida;
    }
    
    public String statusTarefa(){
        return isConcluida()? "Concluída":"Pedente";
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }
}
