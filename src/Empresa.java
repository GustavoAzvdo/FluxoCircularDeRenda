import javax.swing.*;

public class Empresa {
    private JPanel telaEmpresa;
    private JButton btnPagarImposto;
    private JTextField txtSalario;
    private JTextField txtContasPendentes;
    private JButton btnRegistrarCusto;
    private JTextField txtMercadoriaVender;
    private JButton btnVenderMercadoria;
    private JLabel lblResultado;

    public Empresa() {
        // Configura o botão de pagamento de impostos
        btnPagarImposto.addActionListener(e -> pagarImposto());

        // Configura o botão de registrar custos
        btnRegistrarCusto.addActionListener(e -> calcularCusto());

        // Configura o botão de venda de mercadorias
        btnVenderMercadoria.addActionListener(e -> venderMercadoria());
    }

    private void calcularCusto() {
        double salario = verificarCampoNumerico(txtSalario);
        double contasPendentes = verificarCampoNumerico(txtContasPendentes);
        double custoTotal = salario + contasPendentes;

        lblResultado.setText("Custo Total: R$ " + custoTotal);
    }

    private void venderMercadoria() {
        double valorVenda = verificarCampoNumerico(txtMercadoriaVender);
        double custoTotal = verificarCampoNumerico(lblResultado); // Valor dos custos

        double lucro = valorVenda - custoTotal;
        lblResultado.setText("Lucro: R$ " + lucro);
    }

    private void pagarImposto() {
        double lucro = verificarCampoNumerico(lblResultado); // Usa o lucro calculado
        double imposto = lucro * 0.15; // Exemplo: 15% do lucro

        lblResultado.setText("Imposto Pago: R$ " + imposto);
    }

    private double verificarCampoNumerico(JTextField campo) {
        String texto = campo.getText();
        if (texto == null || texto.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(texto);
    }

    private double verificarCampoNumerico(JLabel campo) {
        String texto = campo.getText().replace("Custo Total: R$ ", "").replace("Lucro: R$ ", "");
        if (texto == null || texto.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(texto);
    }





    public JPanel getTelaEmpresa(){
        return telaEmpresa;
    }
}
