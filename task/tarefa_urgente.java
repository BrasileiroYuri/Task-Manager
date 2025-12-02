package task;

import java.time.LocalDate;
import excecao.NegocioException;
import excecao.InfoAutor;

@InfoAutor(nome = "Claudivan urgente")
public class tarefa_urgente extends tarefa {

  public tarefa_urgente(String d, int p, LocalDate a, int pro) throws NegocioException {
    super(d, p, a, pro);
  }

  @Override
  public void atualizar(int a) throws NegocioException {
    if (progresso < 0 || progresso > 100) {
      throw new NegocioException("Progresso deve estar entre 0 e 100.");
    }
    progresso = a;
    if (a == 100) {
      /* tirar da arvore */
    } else {
      double fator = a / 100.0;
      this.prioridade = (int) (this.prioridade * fator);
      if (!isUrgente(this)) {
        /*
         * tirar da arvore essa tafera urgente e adicionar na arvore a tarefa como
         * simples
         */
      }
    }
  }
}
