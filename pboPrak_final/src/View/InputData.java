package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class InputData extends JFrame {
    JLabel windowTitle = new JLabel("Input Product Data");
    
    JLabel lId = new JLabel("Product ID: ");
    JLabel lName = new JLabel("Product Name:");
    JLabel lCat = new JLabel("Category: ");
    JLabel lPrice = new JLabel("Price: ");
    JLabel lQuant = new JLabel("Quantity in Stock: ");

    JTextField tfId = new JTextField();
    JTextField tfName = new JTextField();
    JTextField tfCat = new JTextField();
    JTextField tfPrice = new JTextField();
    JTextField tfQuant = new JTextField();

    public JButton btnSubmit = new JButton("Submit");

    public InputData() {
        setTitle("Input Product Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        add(windowTitle); windowTitle.setBounds(140, 60, 400, 40);
        windowTitle.setFont(new Font("Arial", Font.BOLD, 24));

        add(lId); lId.setBounds(60, 150, 120, 25);
        add(tfId); tfId.setBounds(210, 150, 190, 25);
        add(lName); lName.setBounds(60, 180, 120, 25);
        add(tfName); tfName.setBounds(210, 180, 190, 25);
        add(lCat); lCat.setBounds(60, 210, 120, 25);
        add(tfCat); tfCat.setBounds(210, 210, 190, 25);
        add(lPrice); lPrice.setBounds(60, 240, 120, 25);
        add(tfPrice); tfPrice.setBounds(210, 240, 190, 25);
        add(lQuant); lQuant.setBounds(60, 270, 120, 25);
        add(tfQuant); tfQuant.setBounds(210, 270, 190, 25);

        add(btnSubmit); btnSubmit.setBounds(210, 305, 80, 35);
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSubmit.setBackground(Color.WHITE);
    }

    public String getId() {return tfId.getText();}
    public String getName() {return tfName.getText();}
    public String getCat() {return tfCat.getText();}
    public String getPrice() {return tfPrice.getText();}
    public String getQuant() {return tfQuant.getText();}
}
