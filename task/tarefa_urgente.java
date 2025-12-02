package task;

import java.time.LocalDate;
import excecao.NegocioException;
import excecao.InfoAutor;

@InfoAutor(nome = "Claudivan urgente")
public class tarefa_urgente extends tarefa {

  public tarefa_urgente(String d, int p, LocalDate a) throws NegocioException {
    super(d, p, a);
  }

}
