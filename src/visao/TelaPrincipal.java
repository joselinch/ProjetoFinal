package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnLiberarTP;
	private JButton btnConsultaTP;
	private JButton btnTriagemTP;
	private JButton btnAtendimentoTP;
	private JButton btnBuscarTP;
	private JButton btnCadastrarTP;
	private JMenuItem mntmSiar;
	private JMenuItem mntmRelatrios;
	/**
	 * Launch the application.
	 */

	public JButton getBtnLiberarTP() {
		return btnLiberarTP;
	}

	public void setBtnLiberarTP(JButton btnLiberarTP) {
		this.btnLiberarTP = btnLiberarTP;
	}

	public JButton getBtnConsultaTP() {
		return btnConsultaTP;
	}

	public void setBtnConsultaTP(JButton btnConsultaTP) {
		this.btnConsultaTP = btnConsultaTP;
	}

	public JButton getBtnTriagemTP() {
		return btnTriagemTP;
	}

	public void setBtnTriagemTP(JButton btnTriagemTP) {
		this.btnTriagemTP = btnTriagemTP;
	}

	public JButton getBtnAtendimentoTP() {
		return btnAtendimentoTP;
	}

	public void setBtnAtendimentoTP(JButton btnAtendimentoTP) {
		this.btnAtendimentoTP = btnAtendimentoTP;
	}

	public JButton getBtnBuscarTP() {
		return btnBuscarTP;
	}

	public void setBtnBuscarTP(JButton btnBuscarTP) {
		this.btnBuscarTP = btnBuscarTP;
	}

	public JButton getBtnCadastrarTP() {
		return btnCadastrarTP;
	}

	public void setBtnCadastrarTP(JButton btnCadastrarTP) {
		this.btnCadastrarTP = btnCadastrarTP;
	}

	public JMenuItem getMntmSiar() {
		return mntmSiar;
	}

	public void setMntmSiar(JMenuItem mntmSiar) {
		this.mntmSiar = mntmSiar;
	}

	public JMenuItem getMntmRelatrios() {
		return mntmRelatrios;
	}

	public void setMntmRelatrios(JMenuItem mntmRelatrios) {
		this.mntmRelatrios = mntmRelatrios;
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("TELA PRINCIPAL");
		setResizable(false);
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 424);
		setLocationRelativeTo( null );
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmRelatrios = new JMenuItem("Relat\u00F3rios");
		mnMenu.add(mntmRelatrios);
		
		mntmSiar = new JMenuItem("Sair");
		mnMenu.add(mntmSiar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTelaPrincipal = new JLabel("TELA PRINCIPAL");
		lblTelaPrincipal.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblTelaPrincipal);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[342px][306px]", "[22px][66px][22px][66px][24px][68px]"));
		
		JLabel lblRealizarOCadastro = new JLabel("Realizar o cadastro de um Paciente");
		lblRealizarOCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblRealizarOCadastro, "cell 0 0,growx,aligny top");
		
		btnCadastrarTP = new JButton("CADASTRAR");
		btnCadastrarTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblBuscarOCadastro = new JLabel("Buscar o cadastro de um Paciente");
		lblBuscarOCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblBuscarOCadastro, "cell 1 0,alignx left,aligny top");
		panel_2.add(btnCadastrarTP, "cell 0 1,grow");
		
		btnBuscarTP = new JButton("BUSCAR");
		btnBuscarTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(btnBuscarTP, "cell 1 1,grow");
		
		JLabel lblIniciarAtendimento = new JLabel("Iniciar Atendimento");
		lblIniciarAtendimento.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblIniciarAtendimento, "cell 0 2,alignx center,aligny top");
		
		JLabel lblChamarParaTriagem = new JLabel("Chamar para Triagem");
		lblChamarParaTriagem.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblChamarParaTriagem, "cell 1 2,alignx center,aligny top");
		
		btnAtendimentoTP = new JButton("ATENDIMENTO");
		btnAtendimentoTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(btnAtendimentoTP, "cell 0 3,grow");
		
		btnTriagemTP = new JButton("TRIAGEM");
		btnTriagemTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(btnTriagemTP, "cell 1 3,grow");
		
		JLabel lblChamarParaConsulta = new JLabel("Chamar para Consulta");
		lblChamarParaConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblChamarParaConsulta, "cell 0 4,alignx center,aligny bottom");
		
		JLabel lblLiberarPaciente = new JLabel("Liberar Paciente");
		lblLiberarPaciente.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblLiberarPaciente, "cell 1 4,alignx center,aligny top");
		
		btnConsultaTP = new JButton("CONSULTA");
		btnConsultaTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(btnConsultaTP, "cell 0 5,grow");
		
		btnLiberarTP = new JButton("LIBERAR");
		btnLiberarTP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(btnLiberarTP, "cell 1 5,grow");
	}
}
