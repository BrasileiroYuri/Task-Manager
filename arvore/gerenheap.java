package arvore;
import task.*;
import excecao.InfoAutor;
import heap.Heap;
@InfoAutor(nome = "Claudivan gerencia")
public class gerenheap {
      private Heap<tarefa> heap;

      public gerenheap(){
        this.heap = new Heap<>();
      }

      public void adicionar(tarefa t) {
        heap.push(t);
      }

      public void remover(tarefa t) {
        heap.pop();
      }
      
}
