import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Governo {
    JFrame jota = new JFrame("Governo");

    private JPanel telaGoverno;

    public JPanel getTelaGoverno(){
        return telaGoverno;
    }
    //Imposto
    private JTextField txtImpRenda;
    private JTextField txtImpCorporativo;
    private JButton btnCalculaImp;
    private JTextField txtSomaImp;

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

    private double gastoTotal = 0;

    public Governo() {
        //Imposto
        btnCalculaImp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double impRenda = Double.parseDouble(txtImpRenda.getText());
                    double impCorp = Double.parseDouble(txtImpCorporativo.getText());

                    double totImp = impRenda + impCorp;
                    //gastoTotal += totImp;
                    //txtGG.setText(String.valueOf(gastoTotal));

                    txtSomaImp.setText(String.valueOf(totImp));
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"INSIRA NUMEROS VALIDOS!");
                }
            }
        });

        //Gastos Publicos
        btnCalculaGastos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double saude = Double.parseDouble(txtSaude.getText());
                    double educacao = Double.parseDouble(txtEducacao.getText());
                    double infra = Double.parseDouble(txtInfra.getText());
                    double totalGastosPublicos = saude + educacao + infra;

                    gastoTotal += totalGastosPublicos;
                    txtGG.setText(String.valueOf(gastoTotal));
                    txtTotGastos.setText(String.valueOf(totalGastosPublicos));
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"INSIRA NUMEROS VALIDOS!");
                }
            }
        });

        //Transferencia Social
        btnCalcularTrans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double ass = Double.parseDouble(txtAssSocial.getText());
                    double desemprego = Double.parseDouble(txtDesemprego.getText());
                    double totalTransferencias = ass + desemprego;
                    gastoTotal += totalTransferencias;
                    txtGG.setText(String.valueOf(gastoTotal));

                    txtTotalSoc.setText(String.valueOf(totalTransferencias));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "INSIRA NUMEROS VALIDOS");
                }
            }
        });

        //Gastos Governamentais

        btnAnalisaSit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    txtGG.setText(String.valueOf(gastoTotal));
                    double gg = Double.parseDouble(txtGG.getText());
                    double cofre = Double.parseDouble(txtCofre.getText());

                    if(cofre > gg){
                        txtSituacao.setText("SUPERÁVIT: SALDO POSITIVO");
                    }
                    else{
                        txtSituacao.setText("DÉFICIT: SALDO NEGATIVO");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "INSIRA UM VALOR VALIDO NO COFRES PUBLIVCOS");
                }
            }
        });


    }

}
