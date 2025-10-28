package org.example;

import javax.swing.*;

public class FRmRFacial {
    private JPanel JpanelP;
    private JButton btnLogin;
    private JTextField textField1;
    private JButton tomarFotoButton;

    public JPanel getPanel() {
        return JpanelP;
    }


    public static void main(String[] args) {
        FRmRFacial ventanaPrincipal = new FRmRFacial();
        JFrame ventana = new JFrame("Ventana Reconnocimiento Facial");
        ventana.setContentPane(ventanaPrincipal.getPanel());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setSize(1000,800);
    }
}
