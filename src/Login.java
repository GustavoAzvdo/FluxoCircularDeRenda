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

    private void abrirTelas(){
        familiaButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Familia familia = new Familia();
                jota.setContentPane(familia.getTelaFamilia());
                jota.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jota.pack();
                jota.setVisible(true);
            }
        });
    }







}
