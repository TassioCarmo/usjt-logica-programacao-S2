package br.com.usjt.menezes.aula14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    private JButton bLogin; // botão
    private JLabel lLogin, lSenha; // rótulos
    private JTextField tLogin, tSenha; // campos de texto

    public Login() {
        // chama o construtor da superclasse
        super("Digitar Login e Senha");
        // prepara o Container
        Container jaca = getContentPane();
        // ajusta um FlowLayout para o Container
        jaca.setLayout(new FlowLayout());
        // instanciando os objetos da interface
        lLogin = new JLabel("Login");
        lSenha = new JLabel("Senha");
        tLogin = new JTextField(10);
        tSenha = new JTextField(10);
        bLogin = new JButton("Enviar");
        // torna o botão “sensível” a evento
        bLogin.addActionListener(this);
        // Adiciona os objetos instanciados no Container
        jaca.add(lLogin);
        jaca.add(tLogin);
        jaca.add(lSenha);
        jaca.add(tSenha);
        jaca.add(bLogin);
        // Ajusta tamanho e localização
        setSize(200, 200);
        setLocation(300, 300);
        // Torna a JFrame visível
        setVisible(true);
    } // fim do construtor

    public void actionPerformed(ActionEvent evento) {
        // quando o botão bLogin for clicado, as ações a seguir serão
        // executadas
        if (evento.getSource() == bLogin) {
            // captura o texto digitado pelo usuário no campo tLogin
            // armazenando-o na variável local login
            String login = tLogin.getText();
            // captura o texto digitado pelo usuário no campo tSenha
            // armazenando-o na variável local senha
            String senha = tSenha.getText();
            if (login.equals("usuario") && senha.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Bem-vindo",
                        "Acesso Permitido", 1);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login ou senha não são válidos",
                        "Acesso Negado", 1);
            }
            // limpa os campos de texto
            tLogin.setText("");
            tSenha.setText("");
        }
    } // fim do método actionPerformed
} // fim da classe Login