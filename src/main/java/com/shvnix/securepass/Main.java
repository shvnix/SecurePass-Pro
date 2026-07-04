package com.shvnix.securepass;

import com.formdev.flatlaf.FlatDarkLaf;
import com.shvnix.securepass.ui.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        FlatDarkLaf.setup();

        SwingUtilities.invokeLater(MainWindow::new);
    }
}
