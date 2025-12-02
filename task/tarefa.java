package task;

import java.time.LocalDate;
import excecao.NegocioException;
import excecao.InfoAutor;

@InfoAutor(nome = "Claudivan normal")
public class tarefa implements Comparable<tarefa> {
  protected String desc;
  protected int prioridade;
  protected String data;

  public tarefa(String descricao, int p, String a) throws NegocioException {
    if (p < 0 || p > 10) {
      throw new NegocioException("A prioridade deve estar entre 0 e 10.");
    }   
    desc = descricao;
    prioridade = p;
    data = a;
  }

  @Override
  public int compareTo(tarefa other) {
    return this.prioridade - other.prioridade;
  }

  public tarefa converterParaFilha() throws NegocioException {
    if (isUrgente(this)) {
      return new tarefa_urgente(desc, prioridade, data);
    } else {
      return new tarefa_simples(desc, prioridade, data);
    }
  }

  public boolean isUrgente(tarefa task) {
    return task.prioridade > 5;
  }

  public String toString() {
    return desc + " " + prioridade;
  }

  public String getdesc() {
    return desc;
  }

  public int getdificuldade() {
    return prioridade;
  }

  public String getdata() {
    return data;
  }

  public void setdesc(String d) {
    desc = d;
  }

  public void setdificuldade(int p) {
    prioridade = p;
  }

  public void setdata(String a) {
    data = a;
  }
}
