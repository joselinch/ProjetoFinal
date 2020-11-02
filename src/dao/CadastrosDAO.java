package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CadastrosDAO {

	public CadastrosDAO() {}
	
	public boolean escreveArquivo(String nome, String cpf, String ano) throws IOException {
		FileWriter fwritter = null;
		PrintWriter pwritter = null;
		File arq = new File("cadastros.txt");
		try 
		{
			//escreve em cadastros.txt nome, cpf e ano de nascimento do paciente apos o cadastro
			
			fwritter = new FileWriter(arq, true);
			pwritter = new PrintWriter(fwritter);
			pwritter.println("PACIENTE");
			pwritter.println("Nome: " + nome);
			pwritter.println("CPF: " + cpf);
			pwritter.println("Data Nascimento: " + ano+"\n");
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		} finally {
			pwritter.close();
			fwritter.close();
		}
	}
}
