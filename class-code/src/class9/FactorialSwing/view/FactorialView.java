package class9.FactorialSwing.view;

import class9.FactorialSwing.controller.FactorialController;

/**
 * Created by fsouto on 19/05/16.
 */

import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import javax.swing.*;

public class FactorialView {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public FactorialView(){
        prepareGUI();
    }

    public static void main(String[] args){
        FactorialView  fv = new FactorialView();
        fv.showTextFieldDemo();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Factorial Calculator");
        mainFrame.setSize(300,300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);

        statusLabel.setSize(250,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showTextFieldDemo(){

        JLabel  namelabel= new JLabel("F(n): ", JLabel.RIGHT);
        final JTextField userText = new JTextField(6);

        JButton loginButton = new JButton("Calculate");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = FactorialController.calculateFactorial(userText.getText());
                statusLabel.setText(data);
            }
        });

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(loginButton);
        mainFrame.setVisible(true);
    }
}