package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RelatoriosDAO {

	public RelatoriosDAO() {}
	
	public boolean escreveArquivo(String string1, String string2, String juncstring) throws IOException {
		FileWriter fwritter = null;
		PrintWriter pwritter = null;
		File arq = new File("relatorios.txt");
		try 
		{
			//escreve em relatorios txt cada relatorio com seus dados
			fwritter = new FileWriter(arq, true);
			pwritter = new PrintWriter(fwritter);
			pwritter.println("--------ESPERA ATENDIMENTO ---------");
			pwritter.println(string2);
			pwritter.println("-------- ATENDIMENTO --------");
			pwritter.println(string1);
			pwritter.println("------- ATENDIMENTO FILAS -------");
			pwritter.println(juncstring);
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
