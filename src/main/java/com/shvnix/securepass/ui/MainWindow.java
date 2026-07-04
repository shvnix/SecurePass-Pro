package com.shvnix.securepass.ui;

import com.shvnix.securepass.core.PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class MainWindow extends JFrame {

    private JTextField output;
    private JSpinner length;
    private JCheckBox upper, digits, symbols;

    public MainWindow() {

        setTitle("SecurePass Pro");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initUI();

        setVisible(true);
    }

    private void initUI() {

        JPanel panel = new JPanel(new GridLayout(8, 1, 8, 8));

        length = new JSpinner(new SpinnerNumberModel(12, 4, 64, 1));

        upper = new JCheckBox("Include Uppercase", true);
        digits = new JCheckBox("Include Numbers", true);
        symbols = new JCheckBox("Include Symbols", true);

        output = new JTextField();
        output.setEditable(false);

        JButton generate = new JButton("Generate Password");
        JButton copy = new JButton("Copy Password");

        generate.addActionListener(e -> {
            String pass = PasswordGenerator.generate(
                    (int) length.getValue(),
                    upper.isSelected(),
                    digits.isSelected(),
                    symbols.isSelected()
            );
            output.setText(pass);
        });

        copy.addActionListener(e -> {
            String text = output.getText();
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new StringSelection(text), null);
        });

        panel.add(new JLabel("Password Length"));
        panel.add(length);
        panel.add(upper);
        panel.add(digits);
        panel.add(symbols);
        panel.add(generate);
        panel.add(output);
        panel.add(copy);

        setContentPane(panel);
    }
}
