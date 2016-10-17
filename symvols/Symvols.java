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

    }
    
}
