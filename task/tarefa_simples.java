package task;

import java.time.LocalDate;

public class tarefa_simples extends tarefa{
    int progresso;

    public tarefa_simples(String d, int p,LocalDate a) {
        super(d,p,a);
        progresso = 0;
    }

    public void atualizar(int a){
        progresso = a;
        if(a==100){
            /*tirar da arvore*/
        }
        else{
            double fator = a / 100.0;  
            this.dificuldade = (int)(this.dificuldade * fator);
            if(isUrgente(this)){
                 /*tirar da arvore essa tafera simples e adicionar na arvore a tarefa como urgente*/
            }
        }
    }
}
