import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SetorFinanceiroScreens.*;
public class SetorFinanceiro {
    private CaptacaoRecursos captacao = new CaptacaoRecursos();
    private Investimento investimento = new Investimento();
    private Consulta consulta = new Consulta();
    private JPanel telaSetorFinanceiro;
    private JButton captacaoRecursosButton = new JButton("Captação de Recursos");
    private JButton investimentoButton = new JButton("Investir");
    private JButton consultaSeEButton = new JButton("Consultar saldo e extrato");

    public SetorFinanceiro() {
        captacaoRecursosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                captacao.getTelaCaptacao();
            }
        });

        investimentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                investimento.getTelaInvestimento();
            }
        });

        consultaSeEButton.addActionListener(new ActionListener() {
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
