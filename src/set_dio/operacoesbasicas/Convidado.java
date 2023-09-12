package set_dio.operacoesbasicas;

import java.util.Objects;

public class Convidado {

	private String nome;
	private int codigo;
	
	public Convidado(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Convidado [nome= " + nome + ", codigo= " + codigo + "]";
	}
	
	
	
}