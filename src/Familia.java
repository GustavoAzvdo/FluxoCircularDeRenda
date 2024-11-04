import javax.swing.*;

public class Familia {
    private JPanel telaFamilia;
    private JTextField txtSalarios;
    private JTextField txtAlimentos;
    private JTextField txtAluguel;
    private JButton btnPagarImposto;
    private JTextField txtBeneficios;
    private JLabel lblResultado;
    private JLabel lblRendaMensal;
    private JButton btnRegistrar;
    private JTextField txtConsumo;


    public Familia() {
        // Atualiza a renda familiar ao iniciar
        atualizarRendaFamiliar();

        // Configura o botão de pagar imposto
        btnPagarImposto.addActionListener(e -> {
            enviarImposto();
        });

        // Configura o botão de registrar alterações
        btnRegistrar.addActionListener(e -> {
            atualizarRendaFamiliar(); // Atualiza a renda mensal
            exibirAtualizacoes(); // Exibe as atualizações
        });
    }

    private void atualizarRendaFamiliar() {
        double salarios = verificarCampoNumerico(txtSalarios);
        double beneficios = verificarCampoNumerico(txtBeneficios);
        double rendaTotal = salarios + beneficios;

        lblRendaMensal.setText("Renda Mensal Total: R$ " + rendaTotal);
    }

    private double calcularConsumoTotal() {
        double alimentos = verificarCampoNumerico(txtAlimentos);
        double aluguel = verificarCampoNumerico(txtAluguel);

        return alimentos + aluguel;
    }

    private void calcularPoupanca() {
        double rendaTotal = verificarCampoNumerico(lblRendaMensal);
        double consumoTotal = calcularConsumoTotal();
        double poupanca = rendaTotal - consumoTotal;

        lblResultado.setText("Poupança Gerada: R$ " + poupanca);
    }

    private void enviarImposto() {
        double rendaTotal = verificarCampoNumerico(lblRendaMensal);
        double imposto = rendaTotal * 0.1; // Exemplo: 10% da renda

        lblResultado.setText("Imposto Enviado: R$ " + imposto);
    }

    private void exibirAtualizacoes() {
        double salarios = verificarCampoNumerico(txtSalarios);
        double beneficios = verificarCampoNumerico(txtBeneficios);
        double rendaTotal = verificarCampoNumerico(lblRendaMensal);
        double consumoTotal = calcularConsumoTotal();
        double poupanca = rendaTotal - consumoTotal;
        double imposto = rendaTotal * 0.1;

        String mensagem = String.format(
                "Resumo das Atualizações:\n" +
                        "- Salários: R$ %.2f\n" +
                        "- Benefícios: R$ %.2f\n" +
                        "- Renda Mensal Total: R$ %.2f\n" +
                        "- Consumo Total: R$ %.2f\n" +
                        "- Poupança Gerada: R$ %.2f\n" +
                        "- Imposto Enviado: R$ %.2f",
                salarios, beneficios, rendaTotal, consumoTotal, poupanca, imposto
        );

        JOptionPane.showMessageDialog(telaFamilia, mensagem, "Atualizações", JOptionPane.INFORMATION_MESSAGE);
    }

    private double verificarCampoNumerico(JTextField campo) {
        String texto = campo.getText();
        if (texto == null || texto.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(texto);
    }

    private double verificarCampoNumerico(JLabel campo) {
        String texto = campo.getText().replace("Renda Mensal Total: R$ ", "");
        if (texto == null || texto.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(texto);
    }

    public JPanel getTelaFamilia() {
        return telaFamilia;
    }
}


