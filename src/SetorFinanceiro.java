import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SetorFinanceiroScreens.*;

public class SetorFinanceiro {
    private CaptacaoRecursos captacao = new CaptacaoRecursos();
    private Investimento investimento = new Investimento();
    private Consulta consulta = new Consulta();
    private JFrame jotinha = new JFrame("Setor Financeiro");
    private JPanel telaSetorFinanceiro;
    private JButton goCaptacaoButton;
    private JButton goInvestirButton;
    private JButton goConsultarButton;

    public SetorFinanceiro() {
        goCaptacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jotinha.setContentPane(captacao.getTelaCaptacao());
                jotinha.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jotinha.pack();
                jotinha.setVisible(true);
            }
        });

        goInvestirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jotinha.setContentPane(investimento.getTelaInvestimento());
                jotinha.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jotinha.pack();
                jotinha.setVisible(true);
            }
        });

        goConsultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jotinha.setContentPane(consulta.getTelaConsulta());
                jotinha.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jotinha.pack();
                jotinha.setVisible(true);
            }
        });
    }

        public JPanel getTelaSetorFinanceiro(){
            return telaSetorFinanceiro;
        }
  
}
