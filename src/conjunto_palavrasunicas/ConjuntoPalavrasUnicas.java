package conjunto_palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> conjuntoPalavrasUnicas;
	
	public ConjuntoPalavrasUnicas(){
		conjuntoPalavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		this.conjuntoPalavrasUnicas.add(palavra);
	}
	
	
	public void removerPalavra(String palavra){
		Set<String> palavraRemovida = new HashSet<>();
		if (!conjuntoPalavrasUnicas.isEmpty()) {
			for (String p : conjuntoPalavrasUnicas) {
				if (p.equals(palavra)) {
					palavraRemovida.add(p);
					break;
				}
			}
			conjuntoPalavrasUnicas.removeAll(palavraRemovida);
		} else {
			throw new RuntimeException("Conjunto esta vazio!");
		}	
	}
	
	public void verificarPalavra(String palavra) {
		Set<String> palavraVerificar = new HashSet<>(conjuntoPalavrasUnicas);
		if(palavraVerificar.contains(palavra)) {
			System.out.println("\nEsta presente!");
		} else {
			System.out.println("\nNao esta presente!");
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(conjuntoPalavrasUnicas.toString());
	}
	public static void main(String[] args) {
		
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavrasUnicas.adicionarPalavra("Dormir");
		conjuntoPalavrasUnicas.adicionarPalavra("Comer");
		conjuntoPalavrasUnicas.adicionarPalavra("Peidar");
		conjuntoPalavrasUnicas.adicionarPalavra("Assistir");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		conjuntoPalavrasUnicas.removerPalavra("Peidar");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		conjuntoPalavrasUnicas.verificarPalavra("David");
	}

}
