package task;


import excecao.InfoAutor;
import excecao.NegocioException;

@InfoAutor(nome = "Claudivan simples")
public class tarefa_simples extends tarefa {

  public tarefa_simples(String d, int p, String a) throws NegocioException {
    super(d, p, a);
  }

}
