import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Familia {
    private JPanel telaFamilia;
    private JTextField textField1;
    private JTextField txtAlimentos;
    private JTextField txtAluguel;
    private JButton btnPagarImposto;
    private JTextField txtRendaMensal;
    private JButton gerarPoupançaButton;
    private JTextField txtConsumo;
    private JLabel lblResultado;


    public Familia() {  // Corrigido para usar o nome correto da classe
        // Configura o botão para calcular a poupança quando clicado
        gerarPoupançaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPoupanca();
            }
        });
    }

    private void calcularPoupanca() {
        try {
            // Obtém os valores de txtRendaMensal e txtConsumo
            double rendaMensal = Double.parseDouble(txtRendaMensal.getText());
            double consumo = Double.parseDouble(txtConsumo.getText());

            // Calcula a diferença (poupança)
            double poupanca = rendaMensal - consumo;

            // Exibe o resultado no lblResultado
            lblResultado.setText("Poupança: " + poupanca);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(telaFamilia, "Por favor, insira valores numéricos válidos.");
        }
    }

    public JPanel getTelaFamilia() {
        return telaFamilia;
    }
}


