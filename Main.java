import task.tarefa;
import java.time.LocalDate;

import excecao.NegocioException;
import heap.Heap;
import excecao.InfoAutor;
import task.tarefa_simples;
import task.tarefa_urgente;


public class Main {

    public static void main(String[] args) {

      
        Class<?>[] classes = {
    tarefa.class,
    tarefa_urgente.class,
    tarefa_simples.class,
    Heap.class,
    NegocioException.class
   
    };
        for (Class<?> cls : classes) {
    InfoAutor autor = cls.getAnnotation(InfoAutor.class);

    if (autor != null) {
        System.out.println("📜 Classe: " + cls.getSimpleName());
        System.out.println("Nome: " + autor.nome());
        
        System.out.println("----------------------------------------");
    }
}
        Heap<tarefa> h = new Heap<>();

        try {
            
            tarefa t4 = new tarefa("t4", 4, LocalDate.now());
            tarefa t5 = new tarefa("t5", 5, LocalDate.now());
            tarefa t6 = new tarefa("t6", 6, LocalDate.now());
            tarefa t2 = new tarefa("t2", 2, LocalDate.now());
            tarefa t1 = new tarefa("t1", 1, LocalDate.now());
            tarefa t3 = new tarefa("t3", 3, LocalDate.now());

            System.out.println("✔ Inserindo tarefas na heap...\n");

            h.push(t5.converterParaFilha());
            h.push(t6.converterParaFilha());
            h.push(t3.converterParaFilha());
            h.push(t4.converterParaFilha());
            h.push(t1.converterParaFilha());
            h.push(t2.converterParaFilha());

           
            System.out.println("\n📌 Estado atual da HEAP:");
            h.print();

            System.out.println("\n📌 Tarefas ordenadas por prioridade:");
            
          
            System.out.println("\n✔ Removendo a tarefa de maior prioridade:");
            h.pop();

            System.out.println("\n📌 Heap após remoção:");
            h.print();

        } catch (NegocioException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

