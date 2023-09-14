package br.com.qwasolucoes.mentoria.interfaces.algoritmos;

/**
 * �rvores bin�rias de busca 
 * 
 * Assim como �rvores bin�rias generalizam a ideia de listas encadeadas, �rvores bin�rias de busca (= binary search trees = BSTs) 
 * 
 * generalizam a ideia de listas encadeadas crescentes.
 * 
 * @author ronan
 *
 */
public interface ArvoreBinariaBusca {

	public void inserir(int elemento);
	
	/**
	 * �rvore em ordem
	 * 
	 * � a estrat�gia de varredura de �rvore bin�ria na qual l�-se primeiro a sub-�rvore esquerda em intra-ordem, seguido pelo n� raiz e finalmente pela sub-�rvore direita em intra-ordem
	 * 
	 * @return �rvore em ordem
	 */
	public int[] todosOrdenado();
	
	/**
	 * �rvore pr� ordem
	 * 
	 * � a estrat�gia de varredura de uma �rvore bin�ria na qual o primeiro n� � o n� raiz, seguido pela sub-�rvore esquerda em pr�-ordem e finalmente pela sub-�rvore direita em pr�-ordem;
	 * 
	 * @return �rvore pr� ordem
	 */
	public int[] preOrdem();
	
	/**
	 * �rvore p�s ordem
	 * 
	 * � a estrat�gia de varredura na qual primeiro l�-se os n�s da sub-�rvore esquerda em p�s-ordem, depois os n�s da sub-�rvore direita em p�s-ordem e finalmente o n� raiz.
	 * 
	 * @return �rvore p�s ordem
	 */
	public int[] posOrdem();
	
	public int primeiro();
	
	public int ultimo();
	
}
