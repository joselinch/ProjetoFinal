package modelo;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class Funcionalidades {
	
    public static Lista listaCadastro = new Lista();
	public static Lista listaPacientesProntos = new Lista();
	public static Fila atend = new Fila();
	public static Fila fila1 = new Fila();
	public static Fila fila2 = new Fila();
	public static Fila fila3 = new Fila();
	public static Fila fila4 = new Fila();
	public static Fila fila5 = new Fila();
	public static String juncstring = "";
	
//Criacao das filas e listas.

public static Paciente cadastroPaciente(String nome, int ano, String cpf) {
	Paciente p1 = new Paciente(nome, cpf, ano);
	return p1;
}

//Metodo que recebe do controle nome, ano e cpf do controle e retorna ao mesmo p1.

public static Paciente consultaCadastro(String cpf) {
	Paciente cadastrado = new Paciente();
	cadastrado = listaCadastro.searchByID(cpf);
	if (cadastrado != null) {
		return cadastrado;
	} else {
		return null;
	}
}
//Metodo que recebe um cpf do controle e retorna ao mesmo a busca pelo cadastro ou null caso o cpf n�o seja encontrado na lista.

public static void realizaAtendimento(Paciente dado, String data, int hora, int min) {
	Atendimento a1 = new Atendimento(dado, data, hora, min);
	atend.enqueue(a1);
	
}
//Metodo que recebe dado, data, hora e minuto do controle, seta como a1 e insere na fila de atendimentos
	
public static Atendimento retornaCabeca(){
	Atendimento a = atend.head().info;
	return a;
}
//Metodo que retorna ao controle o Atendimento que est� na "cabeca" da fila.

public static void realizaTriagem(int prioridade, int temperatura) {
	Atendimento a = atend.dequeue().info;
	if(prioridade == 1) {
		a.setPrioridade(1);
		fila1.enqueue(a);
		//System.out.println("inserido fila 1");
	}
	else if(prioridade == 2) {
		a.setPrioridade(2);
		fila2.enqueue(a);
		//System.out.println("inserido fila 2");
	}
	else if(prioridade == 3) {
		a.setPrioridade(3);
		fila3.enqueue(a);
		//System.out.println("inserido fila 3");
	}
	else if(prioridade == 4) {
		a.setPrioridade(4);
		fila4.enqueue(a);
		//System.out.println("inserido fila 4");
	}
	else {
		a.setPrioridade(5);
		fila5.enqueue(a);
		//System.out.println("inserido fila 5");
	}
	a.setTemperatura(temperatura);
}
//Metodo que recebe prioridade e temperatura do controle, remove um Atendimento da fila de atendimentos e o coloca o mesmo em uma fila dependendo da sua prioridade

public static Atendimento chamaConsulta() {
	if(!fila1.isEmpty()) {
		return fila1.dequeue().info;
	} else if (!fila2.isEmpty()){
		return fila2.dequeue().info;
		} else if (!fila3.isEmpty()){
		return fila3.dequeue().info;
		} else if (!fila4.isEmpty()){
			return fila4.dequeue().info;
		} else if (!fila5.isEmpty()){
			return fila5.dequeue().info;
		} else {
			System.out.println("Todas as filas estão vazias");
			return null;
		}
}
//Metodo que verifica qual o pr�ximo paciente que deve ser atendido e retorna ao controle. Caso todas as filas estejam vazias retorna null.

public static Atendimento headFila() {
	if(!fila1.isEmpty()) {
		return fila1.head().info;
	} else if (!fila2.isEmpty()){
		return fila2.head().info;
		} else if (!fila3.isEmpty()){
		return fila3.head().info;
		} else if (!fila4.isEmpty()){
			return fila4.head().info;
		} else if (!fila5.isEmpty()){
			return fila5.head().info;
		} else {
			return null;
		}
}
//Metodo que retorna ao controle qual a "cabeca"/primeiro paciente na fila de atendimento. 

public static void realizaConsulta(Atendimento a, int hora, int minuto, String parecer) {
	a.sethAtend(hora);
	a.setmAtend(minuto);
	int tempo = (hora-a.getHoraChegada())*60 + minuto-a.getMinChegada();
	espera+=tempo;
	numAtend++;
	a.setParecer(parecer);
	listaPacientesProntos.addEnd(a);
}
//Metodo que recebe do controle o Atendimento a, a hora, minuto e o parecer da consulta, "armazenando" os mesmos e adicionando o paciente a lista de pacientes prontos.

public static boolean altaPaciente(String cpf1, int hora, int minuto) {
	Atendimento alta = listaPacientesProntos.searchCpf(cpf1);
	if (alta != null) {
		alta.setHoraSaida(hora);
		alta.setMinSaida(minuto);
		
		int tempo = (hora-alta.gethAtend())*60 + minuto-alta.getmAtend();
		duracaoAtend+=tempo;
		liberados++;
		return true;
	} else {
		return false;
	}
}
//Aqui o metodo recebe do controle o cpf, a hora e minuto de liberacao e remove o proximo paciente da fila de prontos.

public static String relatorioEsperaAtendimento() {	
	string2 = "Numero de atendimentos ocorridos: " + numAtend + "\n" + "Tempo de espera: " + espera/60 + "\n" + "Media de tempo de espera: " + (double)espera/numAtend/60 + "\n";
	return string2;
}
    //metodo que faz a disponibilizacao dos relatorios sobre a espera de atendimento e o numero de atendimentos realizados. Como hora e minuto foram coletados de maneira separada
    //e convertida a hora em minutos, feito a media e apos convertido novamente para horas.
public static String relatorioAtendimento() {
	string1 = "Numero de atendimentos ocorridos com pacientes liberados: " + liberados +"\n" + "Tempo de atendimento " + duracaoAtend/60 + "\n" + "Media de tempo de atendimento: " + (double)duracaoAtend/liberados/60 + "\n";
	return string1;
	//metodo que faz a disponibilizacao dos relatorios sobre a demora dos atendimentos até a liberacao do paciente. Como hora e minuto foram coletados de maneira separada
    //e convertida a hora em minutos, feito a media e apos convertido novamente para horas.
}

public static String relatorioAtendimentoFilas() {
	int [] fila = new int [6];
	int [] qtd = new int [6]; 		
	for (int i=0; i<listaPacientesProntos.retornaTamanho(); i++) {
		Nodo aux = listaPacientesProntos.retornaNodo(i);
		int prioridade = aux.getInfo().getPrioridade();
		int tempo = (aux.getInfo().getHoraSaida() - aux.getInfo().getHoraChegada())*60 + aux.getInfo().getMinSaida() - aux.getInfo().getMinChegada();
		fila[prioridade]+=tempo;
		qtd[prioridade]++;
		
	}
	for(int i=1;i<6;i++) {
		if(qtd[i]!=0) {
		String string = "Tempo medio de atendimento da fila " + i + " = " + fila[i]/qtd[i];
	    juncstring = juncstring + string;
	}
		if (juncstring == null) {
		juncstring = "Nenhum dado encontrado.";
		return juncstring;
	} else {
	return juncstring;
	}
}
return juncstring;	
}
// faz o relatorio baseado nas filas, seus tempos e seus tamanhos.

static int espera;
static int numAtend;
static int duracaoAtend;
static int liberados;
static String string1, string2;
//variaveis que auxiliam nos relatorios
}
