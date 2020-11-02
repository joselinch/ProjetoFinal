package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.RelatoriosDAO;
import modelo.Funcionalidades;
import visao.TelaAtendimento;
import visao.TelaCadastro;
import visao.TelaConsulta;
import visao.TelaPrincipal;
import visao.TelaRealizarConsulta;
import visao.TelaTriagem;


public class ControleTelaPrincipal implements ActionListener{
	//instanciados os objetos
	private TelaPrincipal tp;
	private TelaCadastro tc;
	private TelaConsulta tco;
	private TelaTriagem tt;
	private TelaAtendimento ta;
	private TelaRealizarConsulta trc;
	private Funcionalidades f;
	private RelatoriosDAO r;
	
	//controle com os seus objetos
	public ControleTelaPrincipal(TelaPrincipal tp, TelaCadastro tc, TelaConsulta tco, TelaTriagem tt, TelaAtendimento ta, TelaRealizarConsulta trc, RelatoriosDAO r) {
		super();
		this.tp = tp;
		this.tc = tc;
		this.tco = tco;
		this.tt = tt;
		this.ta = ta;
		this.trc = trc;
		this.r = r;
		
		//dao para salvar arquivo de relatorio
		r = new RelatoriosDAO();
		
		this.tp.getBtnAtendimentoTP().addActionListener(this);
		this.tp.getBtnBuscarTP().addActionListener(this);
		this.tp.getBtnCadastrarTP().addActionListener(this);
		this.tp.getBtnConsultaTP().addActionListener(this);
		this.tp.getBtnLiberarTP().addActionListener(this);
		this.tp.getBtnTriagemTP().addActionListener(this);
		this.tp.getMntmRelatrios().addActionListener(this);
		this.tp.getMntmSiar().addActionListener(this);
		
	}
	@Override
	//a maioria � apenas navegacao entre as telas.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("CADASTRAR")) {
			this.tc.setVisible(true);
			this.tp.dispose();
		}
		if(e.getActionCommand().equals("BUSCAR")) { 
			this.tco.setVisible(true);
			this.tp.dispose();
		}
		if(e.getActionCommand().equals("ATENDIMENTO")) {
			this.ta.setVisible(true);
			this.tp.dispose();
		}
		
		//abre a triagem caso exista paciente na fila e ja indica qual o paciente na lbl
		if(e.getActionCommand().equals("TRIAGEM")) {
			try{
				this.tt.getLblPacnome().setText(this.f.retornaCabeca().getPessoa().getNome());
				this.tt.setVisible(true);
				this.tp.dispose();
			}catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "N�o existem mais pacientes na lista para a Triagem!");
			}
		}
		//solicita atraves de JOptionPanes os dados do paciente com hora e data de saida e libera o mesmo atrav�s do modelo
		if(e.getActionCommand().equals("LIBERAR")) {
			try {
				String cpf = JOptionPane.showInputDialog("Digite o CPF a ser liberado: ");
				int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de libera��o: "));
				int min = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de libera��o: "));
			if(this.f.altaPaciente(cpf, hora, min) == true) {
				JOptionPane.showMessageDialog(null, "Paciente liberado");
			}
			else{
				JOptionPane.showMessageDialog(null, "Paciente n�o encontrado, por favor, retome o processo.");
			};
			} catch(Exception e1){
				JOptionPane.showInputDialog("Algum dado foi inserido incorretamente.");
			}
			}
		
		//caso nao existam pacientes nas filas avisa sen�o inicia a consulta
		if(e.getActionCommand().equals("CONSULTA")) {
			try {
			this.trc.getLblPct().setText(this.f.headFila().getPessoa().getNome());
			this.trc.setVisible(true);
			this.tp.dispose();
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Todas as filas est�o vazias!");
			}
		}
		
		//fecha o programa
		if(e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
		//gera relatorios e grava no dao
		if(e.getActionCommand().equals("Relat�rios")) {
		try {
			this.r.escreveArquivo(this.f.relatorioAtendimento(), this.f.relatorioEsperaAtendimento(), this.f.relatorioAtendimentoFilas());
			JOptionPane.showMessageDialog(null, "-- ESPERA ATENDIMENTO --\n" + this.f.relatorioEsperaAtendimento());
			JOptionPane.showMessageDialog(null, "-- ATENDIMENTO --\n" + this.f.relatorioAtendimento());
			JOptionPane.showMessageDialog(null, "-- ATENDIMENTO FILAS --\n" + this.f.relatorioAtendimentoFilas() + (""));
			JOptionPane.showMessageDialog(null, "Relat�rios apresentados e guardados.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Erro ao criar relat�rio.");
		}
		}
	}

}
