import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    Myframe() {
        ImageIcon icon = new ImageIcon("T.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(200, 400, 150, 150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(200, 100, 100, 100);
        button.addActionListener(this);
        button.setText("click here");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans", Font.BOLD, 25));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 500);
        this.add(button);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("poo");
            label.setVisible(true);

        }
    }
}
