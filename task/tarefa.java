package task;
import java.time.LocalDate;

public class tarefa {
    protected String desc;
    protected int prioridade;
    protected LocalDate data;

    public tarefa(String descricao, int p, LocalDate a) {
        desc = descricao;
        prioridade = p;
        data = a;
    }
    public tarefa converterParaFilha(tarefa task) {
        if ("funcdeselecao") {
        return new tarefa_urgente(task.desc,task.prioridade,task.data);
        } 
        else {
        return new tarefa_simples(task.desc, task.prioridade,task.data);
        }
    }
   
    public String getdesc(){
        return desc;
    }
    public int getprioridade(){
        return prioridade;
    }
    public LocalDate getdata(){
        return data;
    }
    public void setdesc(String d){
        desc = d;
    }
    public void getprioridade(int p){
        prioridade = p;
    }
    public void getdata(LocalDate a){
        data = a;
    }
}

