package task;

import java.time.LocalDate;
import excecao.InfoAutor;
import excecao.NegocioException;

@InfoAutor(nome = "Claudivan simples")
public class tarefa_simples extends tarefa {

  public tarefa_simples(String d, int p, LocalDate a) throws NegocioException {
    super(d, p, a);
  }

}
