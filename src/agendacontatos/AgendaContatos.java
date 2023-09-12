package agendacontatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	Set<Contato> agendaContatos;
	
	public AgendaContatos() {
		agendaContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		this.agendaContatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> pesquisado = new HashSet<>();
		if (!agendaContatos.isEmpty()) {
			for (Contato ct : agendaContatos) {
				if (ct.getNome().startsWith(nome)) {
					pesquisado.add(ct);
					break;
				} 
			}
			return pesquisado;
		} else {
			throw new RuntimeException ("Lista de contatos vazia");
		}
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		
		if (!agendaContatos.isEmpty()) {
			Contato contatoAtualizado = null;
			for (Contato ct : agendaContatos) {
				if (ct.getNome().equalsIgnoreCase(nome)) {
					ct.setNumero(novoNumero);
					contatoAtualizado = ct;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException ("Lista vazia! Impossivel atualizar...");
		}
	}
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("David", 859971736);
		agendaContatos.adicionarContato("Renan", 859978666);
		agendaContatos.adicionarContato("Epifanio", 85995555);
		
		agendaContatos.exibirContatos();
		
		System.out.println("CONTATO ATUALIZADO: " + agendaContatos.atualizarNumeroContato("David", 333));
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Renan"));
	}

}
