package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes_auxiliares.Constantes;

public class TelaLogin extends JFrame {

	private JPanel painelPrincipal;
	private JTextField txtFEmail;
	private JTextField txtFSenha;
	private JLabel lblEsqueciMinhaSenha ;
	private JButton btnLogin;
	
	
	public TelaLogin() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 499, 561);
		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Constantes.corFundo);
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);

		JLabel lblTelaLogin = new JLabel("Tela Login");
		lblTelaLogin.setFont(Constantes.tipoFonteTitulo);
		lblTelaLogin.setBounds(199, 74, 108, 23);
		painelPrincipal.add(lblTelaLogin);

		txtFEmail = new JTextField();
		txtFEmail.setBounds(169, 164, 188, 36);
		painelPrincipal.add(txtFEmail);
		txtFEmail.setColumns(10);

		txtFSenha = new JTextField();
		txtFSenha.setColumns(10);
		txtFSenha.setBounds(169, 234, 188, 36);
		painelPrincipal.add(txtFSenha);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(Constantes.tipoFonteTexto);
		lblEmail.setBounds(54, 169, 70, 25);
		painelPrincipal.add(lblEmail);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(Constantes.tipoFonteTexto);
		lblSenha.setBounds(54, 242, 70, 25);
		painelPrincipal.add(lblSenha);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(190, 357, 117, 25);
		painelPrincipal.add(btnLogin);

		lblEsqueciMinhaSenha = new JLabel("esqueci minha senha");
		lblEsqueciMinhaSenha.setBounds(221, 283, 150, 23);
		painelPrincipal.add(lblEsqueciMinhaSenha);

		adicionarOuvintes();


		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	private void adicionarOuvintes() {

		this.lblEsqueciMinhaSenha.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {

				lblEsqueciMinhaSenha.setText("esqueci minha senha");
				lblEsqueciMinhaSenha.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblEsqueciMinhaSenha.setForeground(Color.black);
			
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				lblEsqueciMinhaSenha.setText("<html><u>esqueci minha senha</u>");
				lblEsqueciMinhaSenha.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblEsqueciMinhaSenha.setForeground(Color.blue);
			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}


		});
		
		
		this.btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

					
				
			}
		});
		
		


	}

}
