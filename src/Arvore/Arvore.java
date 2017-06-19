package Arvore;

public class Arvore implements IArvore {

public NoArvore inserir(NoArvore aux, int valor) {
if(aux==null){
NoArvore novo=new NoArvore();
novo.setValor(valor);
novo.setDir(null);
novo.setEsq(null);
}else if(valor<aux.getValor()){
aux.setEsq(inserir(aux.getEsq(),valor));
}else if(valor>aux.getValor()){
aux.setDir(inserir(aux.getDir(),valor));
}
return aux;
	}

	public NoArvore remover(NoArvore aux, int valor) {
		if (valor==aux.getValor()) {
			if (aux.getEsq()==aux.getDir()) {
				return null;
			}else if (aux.getEsq()==null) {
				return aux.getDir();
			}else if (aux.getDir()==null) {
				return aux.getEsq();
			}else{
				NoArvore p = aux.getDir();
				NoArvore p2 = aux.getDir();
				
				while (p.getEsq()!=null) {
					p = p.getEsq();
				}
				p.setEsq(aux.getEsq());
				return p2;
			}
		}else if(valor<aux.getValor()){
			aux.setEsq(remover(aux.getEsq(), valor));
		}else if(valor>aux.getValor()){
			aux.setDir(remover(aux.getDir(), valor));
		}
		
		return aux;	
	}

	public boolean consultar(NoArvore aux, int valor, boolean achou) {
		if (aux != null && !achou) {
			achou = true;
		}else if(valor<aux.getValor()){
			achou = consultar(aux.getEsq(), valor, achou);
		}else if (valor>aux.getValor()) {
			achou = consultar(aux.getDir(), valor, achou);
		}
		return achou;
	}

	public void preOrdem(NoArvore aux) {
		System.out.println(aux.getValor() + " ");
		preOrdem(aux.getEsq());
		preOrdem(aux.getDir());
	}

	public void emOrdem(NoArvore aux) {
		emOrdem(aux.getEsq());
		System.out.print(aux.getValor() + " ");
		emOrdem(aux.getDir());
	}

	public void posOrdem(NoArvore aux) {
		emOrdem(aux.getEsq());
		emOrdem(aux.getDir());
		System.out.print(aux.getValor() + " ");
	}

}
