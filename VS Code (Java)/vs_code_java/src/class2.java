import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;

import javax.swing.*;

public class class2 implements ActionListener{
    JButton button = new JButton("im a button :)");
    JFrame frame = new JFrame("safe space by lsd");
    JLabel text = new JLabel("im text in the text");
    JMenuBar menu = new JMenuBar();
    class2(){
        frame.setLayout(null);
        frame.add(button);
        frame.setBounds(130, 200, 200, 40);
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(text);
        frame.add(menu);

        button.setVisible(true);
        button.setLayout(null);
        button.setBounds(150, 250, 200, 50);
        button.setFocusable(false);
        button.addActionListener(this);

        text.isVisible();
        text.setBounds(150, 50, 200, 50);
        text.setFont(new Font(null, Font.CENTER_BASELINE,20));
        text.setCursor(null);

        menu.setVisible(true);
        menu.setSize(100, 20);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== button){
            System.out.println("bad coding new file in HTML");
        }

        
    }
}
