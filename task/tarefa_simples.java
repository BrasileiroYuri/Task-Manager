package task;

import java.time.LocalDate;
import excecao.InfoAutor;
import excecao.NegocioException;
@InfoAutor(nome = "Claudivan simples")
public class tarefa_simples extends tarefa{
    int progresso;

    public tarefa_simples(String d, int p,LocalDate a) throws NegocioException {
        super(d,p,a);
        progresso = 0;
    }

    public void atualizar(int a) throws NegocioException {
        if (progresso < 0 || progresso > 100) {
        throw new NegocioException("Progresso deve estar entre 0 e 100.");
        }
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
