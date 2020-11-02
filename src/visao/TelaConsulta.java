package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaConsulta extends JFrame {

	private JPanel contentPane;
	private JLabel lblNomepac;
	private JLabel lblDatanasc;
	private JLabel lblCpfpac;
	private JButton btnVoltar;
	private JMenuItem mntmSair;
	private JMenuItem mntmTelaPrincipal;
	private JButton btnConsultar;
	
	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JMenuItem getMntmTelaPrincipal() {
		return mntmTelaPrincipal;
	}

	public void setMntmTelaPrincipal(JMenuItem mntmTelaPrincipal) {
		this.mntmTelaPrincipal = mntmTelaPrincipal;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}

	public JLabel getLblNomepac() {
		return lblNomepac;
	}

	public void setLblNomepac(JLabel lblNomepac) {
		this.lblNomepac = lblNomepac;
	}

	public JLabel getLblDatanasc() {
		return lblDatanasc;
	}

	public void setLblDatanasc(JLabel lblDatanasc) {
		this.lblDatanasc = lblDatanasc;
	}

	public JLabel getLblCpfpac() {
		return lblCpfpac;
	}

	public void setLblCpfpac(JLabel lblCpfpac) {
		this.lblCpfpac = lblCpfpac;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaConsulta() {
		setTitle("Dados do Paciente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 255);
		setLocationRelativeTo( null );
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmTelaPrincipal = new JMenuItem("Tela Principal");
		mnMenu.add(mntmTelaPrincipal);
		
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNomeDoPaciente = new JLabel("Nome do Paciente:");
		lblNomeDoPaciente.setBounds(10, 24, 112, 14);
		panel.add(lblNomeDoPaciente);
		
		lblNomepac = new JLabel("");
		lblNomepac.setBounds(132, 24, 282, 14);
		panel.add(lblNomepac);
		
		JLabel lblDataNasc = new JLabel("Data Nascimento:");
		lblDataNasc.setBounds(10, 49, 112, 14);
		panel.add(lblDataNasc);
		
		lblDatanasc = new JLabel("");
		lblDatanasc.setBounds(132, 49, 282, 14);
		panel.add(lblDatanasc);
		
		JLabel lblCpfDoPaciente = new JLabel("CPF do Paciente:");
		lblCpfDoPaciente.setBounds(10, 74, 112, 14);
		panel.add(lblCpfDoPaciente);
		
		lblCpfpac = new JLabel("");
		lblCpfpac.setBounds(132, 74, 282, 14);
		panel.add(lblCpfpac);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblConsultaPaciente = new JLabel("CONSULTA PACIENTE");
		lblConsultaPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblConsultaPaciente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		btnConsultar = new JButton("Consultar");
		panel_2.add(btnConsultar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnVoltar);
	}
}
