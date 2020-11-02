package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AtendimentoDAO {

	public AtendimentoDAO() {}
	
	public boolean escreveArquivo(String nome, String data, int hora, int min) throws IOException {
		FileWriter fwritter = null;
		PrintWriter pwritter = null;
		File arq = new File("atendimentos.txt");
		try 
		{
			//escreve em um arquivo antendimentos.txt nome, data, hora e min do atendimento do paciente
			fwritter = new FileWriter(arq, true);
			pwritter = new PrintWriter(fwritter);
			pwritter.println("----- PACIENTE ATENDIDO -----");
			pwritter.println("Nome: " + nome);
			pwritter.println("Data: " + data);
			pwritter.println("Hora: " + hora);
			pwritter.println("Minuto: " + min+"\n");
			return true;
		} catch (Exception e){
			return false;
		} finally {
			pwritter.close();
			fwritter.close();
		}
	}
}
