import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetorExterno extends JFrame {
    private JPanel telaSetorExterno;
    private JTextField campoExportacoes;
    private JTextField campoImportacoes;
    private JButton botaoCalcular;
    

    public JPanel getTelaSetorExterno(){

        setTitle("Comércio Exterior");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel labelExportacoes = new JLabel("Valor de Exportações:");
        campoExportacoes = new JTextField(15);
        JLabel labelImportacoes = new JLabel("Valor de Importações:");
        campoImportacoes = new JTextField(15);
        botaoCalcular = new JButton("Calcular");

        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        add(labelExportacoes);
        add(campoExportacoes);
        add(labelImportacoes);
        add(campoImportacoes);
        add(botaoCalcular);
     
        return telaSetorExterno;
        
    }

      private void calcular() {
        try {
            double exportacoes = Double.parseDouble(campoExportacoes.getText());
            double importacoes = Double.parseDouble(campoImportacoes.getText());
            double saldo = exportacoes - importacoes;

            JOptionPane.showMessageDialog(this, "Saldo: " + saldo);
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
        }

          public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
            ComercioExteriorApp app = new ComercioExteriorApp();
            app.setVisible(true);
        });
    }
}
