package modelo;

public class Nodo {
	//caracteristicas de um nodo...
	
	Nodo proximo;
	Nodo anterior;
	Paciente dado;
	public Atendimento info;

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Paciente getDado() {
		return dado;
	}

	public void setDado(Paciente dado) {
		this.dado = dado;
	}

	public Atendimento getInfo() {
		return info;
	}

	public void setInfo(Atendimento info) {
		this.info = info;
	}

	public Nodo() {
		super();
	}

	public Nodo(Paciente dado) {
		this.dado = dado;
		proximo = null;
		anterior = null;
		
	}
	
	public Nodo(Atendimento info) {
		this.info = info;
		proximo = null;
		anterior = null;
		
	}
	

}