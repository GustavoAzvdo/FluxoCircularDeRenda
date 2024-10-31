package SetorFinanceiroScreens;

import javax.swing.*;


public class CaptacaoRecursos {
    private JPanel telaCaptacao;
    private JButton CaptacaoRecursos;
    private JLabel QDC = new JLabel("Quanto deseja captar: ");
    private JTextField areaQDC;
    private String[] seres = {"Familia", "Empresas"};
    private JComboBox<String> setores = new JComboBox<String>(seres);
    private JLabel DQVCOR = new JLabel("De quem você captara os recursos: ");


    public JPanel getTelaCaptacao(){
        return telaCaptacao;
    }
}
