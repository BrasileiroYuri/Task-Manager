package arvore;

public interface arvorei<K, V> {
    void inserir(K chave, V valor);
    void remover(K chave);
    V buscar(K chave);
}
