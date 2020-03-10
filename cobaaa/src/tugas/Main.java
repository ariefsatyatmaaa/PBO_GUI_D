package tugas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu extends JFrame implements ActionListener {
    JLabel ljudul;
    JButton btnLB;
    JButton btnVB;
    JButton btnVT;

    Menu() {
        ljudul = new JLabel("------- MENU PERHITUNGAN -------");
        btnLB = new JButton("1. Luas Balok");
        btnVB = new JButton("2. Volume Balok");
        btnVT = new JButton("3. Volume Tabung");

        btnLB.addActionListener(this);
        btnVB.addActionListener(this);
        btnVT.addActionListener(this);

        setLayout(null);
        add(ljudul);
        add(btnLB);
        add(btnVB);
        add(btnVT);

        ljudul.setBounds(70, 10, 180, 25);
        btnLB.setBounds(70, 40, 180, 25);
        btnVB.setBounds(70, 70, 180, 25);
        btnVT.setBounds(70, 100, 180, 25);

        setTitle("MENU PERHITUNGAN");
        setSize(330, 200);
        ljudul.setHorizontalAlignment(SwingConstants.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLB) {
            setVisible(false);
            new lbalok();
        } else if (e.getSource() == btnVB) {
            setVisible(false);
            new vbalok();
        } else if (e.getSource() == btnVT) {
            setVisible(false);
            new vtabung();
        }
    }
}