package tren;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GUItren {

    private JButton button1;
    private JPanel Zapisywanie;
    private JTextPane textPane1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("zapisZ_Interfejsu");
        frame.setContentPane(new GUItren().Zapisywanie);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GUItren() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tekst = textPane1.getText();
                PrintWriter zapis = null;
                try {
                    zapis = new PrintWriter("ala.txt");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                zapis.println(tekst);
                textPane1.setText("");
                zapis.close();
            }
        });
    }
}