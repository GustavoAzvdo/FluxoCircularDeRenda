import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SetorFinanceiroScreens.*;
public class SetorFinanceiro {
    private CaptacaoRecursos captacao = new CaptacaoRecursos();
    private Investimento investimento = new Investimento();
    private Consulta consulta = new Consulta();
    private JPanel telaSetorFinanceiro;
    private JButton captacaoButton;
    private JButton investirButton;
    private JButton consultarButton;

    public SetorFinanceiro() {
        captacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                captacao.getTelaCaptacao();
            }
        });

        investirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                investimento.getTelaInvestimento();
            }
        });

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consulta.getTelaConsulta();
            }
        });
    }

        public JPanel getTelaSetorFinanceiro(){
        return telaSetorFinanceiro;
        }
  
}
