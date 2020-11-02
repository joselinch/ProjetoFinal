package modelo;

import java.util.Scanner;


public class Lista {
    private Nodo primeiro;
    private Nodo ultimo;
    

    public Lista(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void removePosition(int posicao){
        Nodo remover = retornaNodo(posicao);
        if(remover == primeiro){
            primeiro.proximo.anterior = null;
            primeiro = primeiro.proximo;
        } else if (remover == ultimo){
            ultimo.anterior.proximo = null;
            ultimo = ultimo.anterior;
        } else {
            remover.anterior.proximo = remover.proximo;
            remover.proximo.anterior = remover.anterior;
        }
    }
    //remove determinada posição da lista

    public Nodo retornaNodo(int posicao){
        Nodo aux = primeiro;
        for(int i=0; i<posicao; i++){
            if(aux != null){
                aux = aux.proximo;
            } else {
                break;
            }
        }
        return aux;
    }

   //retorna os dados presentes em determinada posição da lista
    public String retornaDado(int posicao){
        Nodo aux = primeiro;
        for(int i=0; i<posicao; i++){
            if(aux != null){
                aux = aux.proximo;
            } else {
                break;
            }
        }
        if(aux == null){ return null; }
        else { return aux.dado.getNome(); }
    }


    public boolean isCadastrado (String cpf){
        Nodo aux = primeiro;
        while(true){
            if(aux.dado.getCpf().equalsIgnoreCase(cpf)){
            	return true;
            }
            	else if (primeiro.proximo != null) {
            		aux = primeiro.proximo;
            	} else {
            		return false;
            	} 
            }
    }
//verifica se o cpf está cadastrado na lista
    public void imprimir3(){
        for (int i=0; i<retornaTamanho(); i++){
            System.out.println(retornaDado(i));
        }
    }

    public void imprimir2(){
        Nodo aux = primeiro;
        while(true){
            System.out.println(aux.dado.getNome());
            if(aux==ultimo){
                break;
            }
            aux=aux.proximo;
        }
    }

    public void imprimir(){
        Nodo aux = primeiro;
        while(aux != ultimo){
            System.out.println(aux.dado.getNome());
            aux=aux.proximo;
        }
        System.out.println(ultimo.dado.getNome());
    }


 // faz a adição de um objeto de Paciente no final da lista
    public void addEnd(Paciente dado){
        Nodo novoNodo = new Nodo(dado);
        if(primeiro==null){
            //lista está vazia
            primeiro=novoNodo;
            ultimo=novoNodo;
        } else {
            ultimo.proximo = novoNodo;
            novoNodo.anterior = ultimo;
            ultimo = novoNodo;
        }

    }
    // faz a adição de um objeto de Atendimento no final da lista
    public void addEnd(Atendimento dado){
        Nodo novoNodo = new Nodo(dado);
        if(primeiro==null){
            //lista está vazia
            primeiro=novoNodo;
            ultimo=novoNodo;            
        } else {
            ultimo.proximo = novoNodo;
            novoNodo.anterior = ultimo;
            ultimo = novoNodo;            
        }
        
    }
    

    public void adicionarNaPosicao(Paciente dado, int posicao){
        Nodo novoNodo = new Nodo(dado);
        Nodo aux = primeiro;

        for(int i=0; i<posicao; i++){
            if(aux != null){
                    aux = aux.proximo;
            } else {
                break;
            }
        }
        if (posicao==0){
            novoNodo.proximo = aux;
            aux.anterior = novoNodo;
            primeiro = novoNodo;
        }
        else if(aux != null) {
            novoNodo.anterior = aux.anterior;
            novoNodo.proximo = aux;
            aux.anterior.proximo = novoNodo;
            aux.anterior = novoNodo;
        } else {
            ultimo.proximo = novoNodo;
            novoNodo.anterior = ultimo;
            ultimo = novoNodo;
            System.out.println("\nA posição informada é maior do que o tamanho da lista. Dado adicionado no final da lista\n");
        }
    }
    //faz a adição de um objeto de Paciente em alguma posição da lista

    public void imprimeDecrescente(){
        Nodo aux = ultimo;
        while(true){
            System.out.println(aux.dado);
            if(aux==primeiro){
                break;
            }
            aux=aux.anterior;
        }
    }
    //faz a impressão da lista de maneira inversa

    public int retornaTamanho(){
        int tamanho = 0;
        Nodo aux = primeiro;
        while(true){
            if(aux != null){
                tamanho++;
                aux = aux.proximo;
            } else {
                break;
            }
        }
        return tamanho;
    }
    // retorna o tamanho da lista

	public Paciente searchByID(String cpf) {
		Nodo aux = primeiro;
		while (aux != null) {
			if (aux.getDado().getCpf().equalsIgnoreCase(cpf)) {
				return aux.getDado();
			} else {
				aux = aux.getProximo();
			}
		}
		return null;
	}
	// faz a busca do paciente na lista através do cpf
	public Atendimento searchCpf(String cpf) {
		Nodo aux = primeiro;

		while (aux != null) {
		
			if (aux.getInfo().getPessoa().getCpf().equalsIgnoreCase(cpf)) {
				return aux.getInfo();
			} else {
				aux = aux.getProximo();
			}
		}
		return null;
	}
}