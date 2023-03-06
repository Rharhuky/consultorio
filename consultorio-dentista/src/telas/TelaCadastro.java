package telas;
import javax.swing.JLabel;

import classes_auxiliares.Constantes;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaCadastro extends TelaPadrao {

	private JLabel lblCadastroAdministrador;
	private JButton btnLimparCampos;
	private JTextField txtFEmail;
	private JButton btnCadastrar;
	private JTextField txtFSenha;
	private JTextField txtFNome;

	private JLabel lblEmail;
	private JLabel lblSenha;
	private JLabel lblNome;

	public TelaCadastro() {


	}

	@Override
	public void adicionarLbl() {

		lblCadastroAdministrador = new JLabel("Cadastro Administrador");
		lblCadastroAdministrador.setBounds(136, 67, 227, 39);

		lblCadastroAdministrador.setFont(Constantes.tipoFonteTitulo);


		lblEmail = new JLabel("Email");
		lblEmail.setBounds(51, 212, 44, 15);
		getContentPane().add(lblEmail);

		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(48, 289, 70, 15);
		getContentPane().add(lblSenha);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(51, 369, 44, 15);
		getContentPane().add(lblNome);

		getContentPane().add(lblCadastroAdministrador);


	}

	@Override
	public void adicionarTxtFields() {

		txtFEmail = new JTextField();
		txtFEmail.setBounds(136, 200, 227, 39);
		getContentPane().add(txtFEmail);

		txtFSenha = new JTextField();
		txtFSenha.setColumns(10);
		txtFSenha.setBounds(136, 277, 227, 39);
		getContentPane().add(txtFSenha);

		txtFNome = new JTextField();
		txtFNome.setColumns(10);
		txtFNome.setBounds(136, 357, 227, 39);
		getContentPane().add(txtFNome);

	}

	@Override
	public void adicionarBtn() {

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(95, 425, 117, 25);
		getContentPane().add(btnCadastrar);

		btnLimparCampos = new JButton("Limpar ");
		btnLimparCampos.setBounds(259, 425, 117, 25);

		getContentPane().add(btnLimparCampos);

	}


	@Override
	public void adicionarOuvintes() {

		//		this.btnCadastrar
		this.btnLimparCampos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtFEmail.setText("");
				txtFNome.setText("");
				txtFSenha.setText("");

			}
		});

	}
}
