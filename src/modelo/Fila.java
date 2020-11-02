package modelo;

import java.util.Scanner;

public class Fila {
    protected int dimensao = 0;
    protected Nodo inicio;
    protected Nodo fim;
    

	
    public int size() {
        return dimensao;
    }
// retorna o tamanho da fila
   
    public boolean isEmpty(){
        return size()==0;
    }

   
    public void clear(){
        inicio=null;
        dimensao=0;
    }
// este metodo remove todos os dados da fila
  
    public Nodo head(){
        return inicio;
    }
//faz o retorno do primeiro elemento da fila, sem que ocorra a remoção
    
    public Nodo dequeue(){
        Nodo aux;
        if(size()>1){
            aux = inicio;
            inicio=inicio.proximo;
            dimensao--;
        } else {
            aux=inicio;
            inicio=null;
            dimensao--;
        }
        return aux;
        //faz o retorno do primeiro elemento da fila com a remoção do mesmo
    }

  
    public void enqueue(Paciente e){
        Nodo novo = new Nodo(e);
        if (isEmpty()){
            inicio=novo;
            fim=novo;
        } else {
            fim.proximo=novo;
            fim=novo;
        }
        dimensao++;
    }
  //Faz a inserção na fila de um objeto Pessoa e
    
    public void enqueue(Atendimento e){
        Nodo novo = new Nodo(e);
        if (isEmpty()){
            inicio=novo;
            fim=novo;
        } else {
            fim.proximo=novo;
            fim=novo;
        }
        dimensao++;
    }
    //Faz a inserção na fila de um objeto Atendimento e
}
