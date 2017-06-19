package Arvore;

public interface IArvore {

public NoArvore inserir(NoArvore aux, int valor);
public NoArvore remover(NoArvore aux, int valor);
public boolean consultar(NoArvore aux, int valor, boolean achou);
public void preOrdem(NoArvore aux);
public void emOrdem(NoArvore aux);
public void posOrdem(NoArvore aux);

}
