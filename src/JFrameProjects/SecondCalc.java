package JFrameProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondCalc {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        JLabel l1 = new JLabel("value1");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel("value2");

        JTextField f1 = new JTextField(20);
        JTextField f2 = new JTextField(20);

        JButton addbutton = new JButton("ADD");
        JButton subtractbutton = new JButton("MINUS");

        jf.add(l1);
        jf.add(f1);
        jf.add(l3);
        jf.add(f2);
        jf.add(addbutton);
        jf.add(subtractbutton);
        jf.add(l2);

        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(f1.getText());
                int val2 = Integer.parseInt(f2.getText());
                int res;

                if(e.getSource()==addbutton){
                    res = val1 + val2;
                }
                else{
                    res = val1 - val2;
                }
                l2.setText(res+" ");
            }
        };

        addbutton.addActionListener(a1);
        subtractbutton.addActionListener(a1);

        jf.setLayout(new FlowLayout());
        jf.setSize(300,250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
