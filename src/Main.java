import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //
        // Abrir tela de escolha de agentes
        //

        JFrame jota = new JFrame("TELAS");
        jota.setContentPane(new Login().getTelaLogin());
        jota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jota.pack(); // Tamanho fixo ao iniciar a janela

        //configs da tela para ela nao ser redimensionada
        jota.setLocationRelativeTo(null);
        jota.setResizable(false);
        jota.setVisible(true);
    }
}