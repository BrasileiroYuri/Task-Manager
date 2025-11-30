package excecao;

public class NegocioException extends Exception {
    public NegocioException(String mensagem) {
        super(mensagem);
    }
}