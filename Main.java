import task.tarefa;
import java.time.LocalDate;

import excecao.NegocioException;

public class Main {

  public static void main(String[] args) {
    Heap<tarefa> h = new Heap<>();
    try {
      tarefa t4 = new tarefa("t4", 4, LocalDate.now(), 1);
      tarefa t5 = new tarefa("t5", 5, LocalDate.now(), 1);
      tarefa t6 = new tarefa("t6", 6, LocalDate.now(), 1);
      tarefa t2 = new tarefa("t2", 2, LocalDate.now(), 1);
      tarefa t1 = new tarefa("t1", 1, LocalDate.now(), 1);
      tarefa t3 = new tarefa("t3", 3, LocalDate.now(), 1);

      h.push(t5);
      h.push(t6);
      h.push(t3);
      h.push(t4);
      h.push(t1);
      h.push(t2);

      h.print();
    } catch (NegocioException e) {
      System.out.println(e.getMessage());
    }

  }
}
