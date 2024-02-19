package com.mycompany.pasajes;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import frontend.MenuJFrame;

public class Pasajes {

    public static void main(String[] args) {
        FlatGitHubIJTheme.setup();
        MenuJFrame menu = new MenuJFrame();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
