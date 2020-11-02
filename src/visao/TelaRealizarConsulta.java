package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class TelaRealizarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHora;
	private JTextField textFieldMinCon;
	private JTextArea textAreaParecer;
	private JLabel lblPct;
	private JMenuItem mntmTelaPrincipal;
	private JMenuItem mntmSair;
	private JButton btnConcluir;
	private JButton btnLimpar;
	
	
	
	/**
	 * Launch the application.
	 */

	public JTextField getTextFieldHora() {
		return textFieldHora;
	}



	public void setTextFieldHora(JTextField textFieldHora) {
		this.textFieldHora = textFieldHora;
	}



	public JTextField getTextFieldMinCon() {
		return textFieldMinCon;
	}



	public void setTextFieldMinCon(JTextField textFieldMinCon) {
		this.textFieldMinCon = textFieldMinCon;
	}



	public JTextArea getTextAreaParecer() {
		return textAreaParecer;
	}



	public void setTextAreaParecer(JTextArea textAreaParecer) {
		this.textAreaParecer = textAreaParecer;
	}



	public JLabel getLblPct() {
		return lblPct;
	}



	public void setLblPct(JLabel lblPct) {
		this.lblPct = lblPct;
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



	public JButton getBtnConcluir() {
		return btnConcluir;
	}



	public void setBtnConcluir(JButton btnConcluir) {
		this.btnConcluir = btnConcluir;
	}



	public JButton getBtnLimpar() {
		return btnLimpar;
	}



	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}



	/**
	 * Create the frame.
	 */
	public TelaRealizarConsulta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblRealizarConsulta = new JLabel("REALIZAR CONSULTA");
		lblRealizarConsulta.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblRealizarConsulta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnConcluir = new JButton("Concluir");
		panel_1.add(btnConcluir);
		
		btnLimpar = new JButton("Limpar");
		panel_1.add(btnLimpar);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblHorrioConsulta = new JLabel("Hora");
		lblHorrioConsulta.setBounds(20, 11, 33, 14);
		panel_2.add(lblHorrioConsulta);
		
		textFieldHora = new JTextField();
		textFieldHora.setBounds(50, 8, 50, 20);
		panel_2.add(textFieldHora);
		textFieldHora.setColumns(10);
		
		JLabel lblMinutoConsulta = new JLabel("Minuto");
		lblMinutoConsulta.setBounds(110, 11, 54, 14);
		panel_2.add(lblMinutoConsulta);
		
		textFieldMinCon = new JTextField();
		textFieldMinCon.setBounds(174, 8, 50, 20);
		panel_2.add(textFieldMinCon);
		textFieldMinCon.setColumns(10);
		
		textAreaParecer = new JTextArea();
		textAreaParecer.setLineWrap(true);
		textAreaParecer.setBounds(0, 36, 424, 125);
		panel_2.add(textAreaParecer);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(234, 11, 46, 14);
		panel_2.add(lblPaciente);
		
		lblPct = new JLabel("");
		lblPct.setBounds(290, 11, 124, 14);
		panel_2.add(lblPct);
	}
}
