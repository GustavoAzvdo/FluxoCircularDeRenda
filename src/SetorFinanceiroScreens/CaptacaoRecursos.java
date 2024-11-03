package SetorFinanceiroScreens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaptacaoRecursos {
    private JPanel telaCaptacao;
    private JLabel nomeCaptacaoLabel;
    private JTextField nomeCaptacaoText;
    private JLabel valorCaptacaoLabel;
    private JTextField valorCaptacaoText;
    private JButton captacaoButton;

    public CaptacaoRecursos(){
        captacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(captacaoButton,"Clicado");
            }
        });
    }

    public JPanel getTelaCaptacao(){
        return telaCaptacao;
    }
}
