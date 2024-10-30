import javax.swing.*;
public class Governo {
    private JPanel telaGoverno;

    public JPanel getTelaGoverno(){
        return telaGoverno;
    }
    //Imposto
    private JTextField txtImpRenda;
    private JTextField txtImpCorporativo;
    private JButton btnCalculaImp;

    //Gastos Publicos
    private JTextField txtSaude;
    private JTextField txtEducacao;
    private JTextField txtInfra;
    private JTextField txtTotGastos;
    private JButton btnCalculaGastos;

    //Transferencias Sociais
    private JTextField txtAssSocial;
    private JTextField txtDesemprego;
    private JTextField txtTotalSoc;
    private JButton btnCalcularTrans;

    //Saldos Orçamentarios
    private JTextField txtGG;
    private JTextField txtCofre;
    private JTextField txtSituacao;
    private JButton btnAnalisaSit;

}
