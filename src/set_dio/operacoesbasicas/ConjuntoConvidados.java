package set_dio.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	Set<Convidado> listaConvidados;
	
	public ConjuntoConvidados (){
		listaConvidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		this.listaConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoRemovido = null;
		
			for (Convidado n : listaConvidados) {
				if (n.getCodigo() == codigoConvite) {
					convidadoRemovido = n;
					break;
				}
			}
			listaConvidados.remove(convidadoRemovido);
	}
	
	public void contarConvidados() {
		System.out.println(this.listaConvidados.size());
	}
	
	public void exibirConvidados() {
		System.out.println("Convidados:");
		System.out.println(listaConvidados);
	}
	
	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("David", 123);
		conjuntoConvidados.adicionarConvidado("Renan", 321);
		conjuntoConvidados.adicionarConvidado("Emylliano", 432);
		conjuntoConvidados.adicionarConvidado("Sara", 432);
		
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.print("QUANTIA CONVIDADOS:");
		conjuntoConvidados.contarConvidados();
		

	}

}
