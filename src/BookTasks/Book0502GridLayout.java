package BookTasks;

import javax.swing.*;
import java.awt.GridLayout;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0502GridLayout {
    public static void main(String[] args) {
        // Panel creation
        JPanel windowContent = new JPanel();
        //Display manager for the Panel
        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);
        //Creation of components in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        //Adding components on Panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        //Creating Frame and setting the Panel to it
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);
        //Setting size and making Frame visible
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}
