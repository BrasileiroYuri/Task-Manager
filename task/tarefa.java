package task;
import java.time.LocalDate;

public class tarefa {
    protected String desc;
    protected int dificuldade;
    protected LocalDate data;

    public tarefa(String descricao, int p, LocalDate a) {
        desc = descricao;
        dificuldade = p;
        data = a;
    }
    public tarefa converterParaFilha(tarefa task) {
        if (isUrgente(task)) {
        return new tarefa_urgente(task.desc,task.dificuldade,task.data);
        } 
        else {
        return new tarefa_simples(task.desc, task.dificuldade,task.data);
        }
    }

    public boolean isUrgente(tarefa task) {
    LocalDate hoje = LocalDate.now();
    long diasRestantes = hoje.until(task.data).getDays();
    double diasLimite = task.dificuldade * 0.7; 
    return diasRestantes <= diasLimite;
    }

    public String getdesc(){
        return desc;
    }
    public int getdificuldade(){
        return dificuldade;
    }
    public LocalDate getdata(){
        return data;
    }
    public void setdesc(String d){
        desc = d;
    }
    public void setdificuldade(int p){
        dificuldade = p;
    }
    public void setdata(LocalDate a){
        data = a;
    }
}

