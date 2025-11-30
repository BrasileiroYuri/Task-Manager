package task;

import java.time.LocalDate;

public class tarefa_urgente extends tarefa{
    int progresso;

    public tarefa_urgente(String d, int p,LocalDate a) {
        super(d,p,a);
        int progresso = 0;
    }

    public void atualizar(int a){
        progresso = a;
        if(a==100){
            /*tirar da arvore*/
        }
        else{
            double fator = a / 100.0;  
            this.dificuldade = (int)(this.dificuldade * fator);
            if(!isUrgente(this)){
                /*tirar da arvore essa tafera urgente e adicionar na arvore a tarefa como simples*/
            }
        }
    }
}
