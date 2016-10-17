/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symvols;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Symvols {
    private JTextField txtField;
    private JLabel txtLabel;
    private JLabel kmLabel;
    private JButton calcButton;
    private JLabel resultLabel;
    private JFrame mainFrame;
    
    Symvols() {
        txtLabel = new JLabel("Текст");
        txtField = new JTextField("Текст");
        txtField.setHorizontalAlignment(JTextField.RIGHT);
        kmLabel = new JLabel("");
        calcButton = new JButton("Рассчитать");
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                   String txt = txtField.getText();
                   int L=txt.length();
                   resultLabel.setText("<html>Количество символов в тексте <font style='color: red; font-weight: bold;'>"+L);
                }
                catch ( NumberFormatException nfe ) {
                    resultLabel.setText("Проверьте введённые данные");
                }
            }
        });
        resultLabel = new JLabel("Введите данные для рассчёта");
        
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.ipadx = 50;
        constraints.gridy = 0;
        layout.setConstraints(txtLabel, constraints);
         
        constraints.gridx = 1;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.ipadx = 350;
        constraints.gridy = 0;
        layout.setConstraints(txtField, constraints);
        
        constraints.gridx = 2;
        constraints.ipadx = 0;
        constraints.gridy = 0;
        layout.setConstraints(kmLabel, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.anchor = GridBagConstraints.EAST;
        layout.setConstraints(calcButton, constraints);
        
        constraints.gridy = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        layout.setConstraints(resultLabel, constraints);
    }
    
}
