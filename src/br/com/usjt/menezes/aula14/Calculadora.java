package br.com.usjt.menezes.aula14;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora extends JFrame implements ActionListener {

    private JLabel numeroLabel, numeroLabel2, resultadoLabel; // rótulos
    private JTextField numeroField, numeroField2, resultadoField; // campos de texto
    private JButton adicaoBotao, subtracaoBotao, divisaoBotao, multiplicaoBotao;

    public Calculadora() {
        // chama o construtor da superclasse
        super("Calculadora");
        // prepara o Container
        Container container = getContentPane();
        // ajusta um FlowLayout para o Container
        container.setLayout(new FlowLayout());
        // instanciando os objetos da interface
        numeroLabel = new JLabel("Digite 1.o valor");
        numeroLabel2 = new JLabel("Digite 1.o valor");
        resultadoLabel = new JLabel("Resultado");

        numeroField = new JTextField(10);
        numeroField2 = new JTextField(10);
        resultadoField = new JTextField(10);
        adicaoBotao = new JButton("Somar");
        subtracaoBotao = new JButton("Subtrair");
        divisaoBotao = new JButton("Dividir");
        multiplicaoBotao = new JButton("multiplicar");
        // torna o botão “sensível” a evento
        adicaoBotao.addActionListener(this);
        subtracaoBotao.addActionListener(this);
        divisaoBotao.addActionListener(this);
        multiplicaoBotao.addActionListener(this);
        // Adiciona os objetos instanciados no Container

        container.add(numeroLabel);
        container.add(numeroField);
        container.add(numeroLabel2);
        container.add(numeroField2);
        container.add(resultadoLabel);
        container.add(resultadoField);
        container.add(adicaoBotao);
        container.add(subtracaoBotao);
        container.add(divisaoBotao);
        container.add(multiplicaoBotao);
        // Ajusta tamanho e localização
        setSize(200, 200);
        setLocation(300, 300);
        // Torna a JFrame visível
        setVisible(true);
    } // fim do construtor

    public void actionPerformed(ActionEvent evento) {
        // quando o botão bLogin for clicado, as ações a seguir serão
        // executadas
        double calculo;
        if (evento.getSource() == adicaoBotao) {

            double numero1 = Double.parseDouble(numeroField.getText());
            double numero2 = Double.parseDouble(numeroField2.getText());
            calculo =+(numero1 + numero2);

            ;
            JOptionPane.showMessageDialog(null, calculo);

        }
        if (evento.getSource() == divisaoBotao) {

            double numero1 = Double.parseDouble(numeroField.getText());
            double numero2 = Double.parseDouble(numeroField2.getText());
            calculo = numero1/ numero2;

            JOptionPane.showMessageDialog(null, calculo);

        }
        if (evento.getSource() == subtracaoBotao) {

            double numero1 = Double.parseDouble(numeroField.getText());
            double numero2 = Double.parseDouble(numeroField2.getText());
            calculo = numero1 - numero2;

            JOptionPane.showMessageDialog(null, calculo);

        }
        if (evento.getSource() == multiplicaoBotao) {

            double numero1 = Double.parseDouble(numeroField.getText());
            double numero2 = Double.parseDouble(numeroField2.getText());
            calculo = numero1 * numero2;

            JOptionPane.showMessageDialog(null, calculo);

        }
        // limpa os campos de texto

    }
} // fim do método actionPerformed
// fim da classe Login

