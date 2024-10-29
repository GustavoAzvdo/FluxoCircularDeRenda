import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
    JFrame jota = new JFrame("TELAS");
    private JButton setorExternoButton;
    private JButton familiaButton;
    private JButton setorFinanceiroButton;
    private JButton governoButton;
    private JButton empresaButton;
    private JPanel telaLogin;
    private JPanel telaFamilia;


    public JPanel getTelaLogin(){
        return telaLogin;
    }
    public JPanel getTelaFamilia(){
        return telaFamilia;
    }
    //Classes das telas
    public Login(){
        abrirTelas();
    }
    /*
     private void abrirTelas() {
         familiaButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Familia familia = new Familia();
                 jota.setContentPane(familia.getTelaFamilia());
                 jota.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 jota.pack();
                 jota.setVisible(true);
             }
         });

     } */
    private void abrirTela(JPanel tela) {
        jota.setContentPane(tela);
        jota.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jota.pack();
        jota.setVisible(true);
    }

    // Método para configurar o botão
    private void configurarBotao(JButton botao, JPanel tela) {
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTela(tela);
            }
        });
    }
    private void abrirTelas() {
        // Instanciação das classes com os painéis
        Empresa empresa = new Empresa();
        Familia familia = new Familia();
        SetorExterno setorExterno = new SetorExterno();
        SetorFinanceiro setorFinanceiro = new SetorFinanceiro();
        Governo governo = new Governo();

        // Configuração dos botões com os respectivos painéis
        configurarBotao(empresaButton, empresa.getTelaEmpresa());
        configurarBotao(familiaButton, familia.getTelaFamilia());
        configurarBotao(setorExternoButton, setorExterno.getTelaSetorExterno());
        configurarBotao(setorFinanceiroButton, setorFinanceiro.getTelaSetorFinanceiro());
        configurarBotao(governoButton, governo.getTelaGoverno());
    }
}








