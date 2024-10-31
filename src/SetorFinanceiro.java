import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SetorFinanceiroScreens.CaptacaoRecursos;
import SetorFinanceiroScreens.Investimento;
public class SetorFinanceiro {
    private CaptacaoRecursos captacao = new CaptacaoRecursos();
    private Investimento investimento = new Investimento();
    private JPanel telaSetorFinanceiro;
    private JButton captacaoRecursosButton = new JButton("Captação de Recursos");
    private JButton investimentoButton = new JButton("Investir");

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
    }

        public JPanel getTelaSetorFinanceiro(){
            return telaSetorFinanceiro;
        }
  
}
