import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

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
        
        botaoRegistrarTransacao = new JButton("Registrar Transação");
        botaoSalvarRascunho = new JButton("Salvar como Rascunho");
        botaoCancelar = new JButton("Cancelar");
        
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
 botaoRegistrarTransacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarTransacao();
            }
        });

        botaoSalvarRascunho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarComoRascunho();
            }
        });

        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });

        add(labelExportacoes);
        add(campoExportacoes);
        add(labelImportacoes);
        add(campoImportacoes);
        add(botaoCalcular);
        add(botaoRegistrarTransacao);
        add(botaoSalvarRascunho);
        add(botaoCancelar);
    }
        return telaSetorExterno;
        
    }

      private void calcular() {
        try {
            double exportacoes = Double.parseDouble(campoExportacoes.getText());
            double importacoes = Double.parseDouble(campoImportacoes.getText());
            double saldo = exportacoes - importacoes;
            repaint();

            JOptionPane.showMessageDialog(this, "Saldo: " + saldo);
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
        }

           public void paint(Graphics g) {
        super.paint(g);
        // Desenho do gráfico de barras
        int x = 100; // Posição inicial no eixo X
        int yBase = 250; // Base do gráfico
        int barWidth = 50; // Largura das barras

        // Desenho da barra de exportações
        g.setColor(Color.BLUE);
        int exportHeight = (int) (exportacoes * 2); // Escala da altura da barra
        g.fillRect(x, yBase - exportHeight, barWidth, exportHeight);
        g.drawString("Exportações", x, yBase + 15);

        // Desenho da barra de importações
        x += barWidth + 30; // Ajusta a posição X para a próxima barra
        g.setColor(Color.RED);
        int importHeight = (int) (importacoes * 2); // Escala da altura da barra
        g.fillRect(x, yBase - importHeight, barWidth, importHeight);
        g.drawString("Importações", x, yBase + 15);
    }


    private void registrarTransacao() {
        // Lógica para registrar a transação
        JOptionPane.showMessageDialog(this, "Transação registrada com sucesso!");
    }

    private void salvarComoRascunho() {
        // Lógica para salvar como rascunho
        JOptionPane.showMessageDialog(this, "Transação salva como rascunho.");
    }

    private void cancelar() {
        // Lógica para cancelar a operação
        JOptionPane.showMessageDialog(this, "Operação cancelada.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SetorExterno app = new SetorExterno();
            app.setVisible(true);
        });
    }
} 
