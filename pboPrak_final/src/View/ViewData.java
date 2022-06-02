package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewData extends JFrame{
    JLabel windowTitle = new JLabel("Product Database");

    public JTable table;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object[] columnName = {"Product ID", "Product Name", "Product Category", "Product Price", "Product Stock"};

    JLabel selected = new JLabel("Selected product: "); 
    public JLabel selectedData = new JLabel();

    public JButton btnReset = new JButton("Refresh");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");


    public ViewData() {
        dtm = new DefaultTableModel(columnName, 0);
        table = new JTable(dtm);
        scrollPane = new JScrollPane(table);
        
        setTitle("View Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        pack();
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        add(windowTitle); windowTitle.setBounds(20, 20, 400, 40);
        windowTitle.setFont(new Font("Arial", Font.BOLD, 24));

        add(btnReset); btnReset.setBounds(590, 40, 80, 30);
        btnReset.setFont(new Font("Arial", Font.PLAIN, 13));
        btnReset.setBackground(Color.WHITE);
        
        add(scrollPane); scrollPane.setBounds(20, 80, 650, 300);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);

        add(selected); selected.setBounds(20, 400, 180, 35);
        selected.setFont(new Font("Arial", Font.BOLD, 14));
        add(selectedData); selectedData.setBounds(200, 400, 200, 35);
        
        add(btnUpdate); btnUpdate.setBounds(500, 400, 80, 35);
        btnUpdate.setBackground(new Color(35,181,222)); 
        btnUpdate.setFont(new Font("Arial", Font.PLAIN, 13));
        btnUpdate.setForeground(Color.WHITE);

        add(btnDelete); btnDelete.setBounds(590, 400, 80, 35);
        btnDelete.setBackground(new Color(222,51,35)); 
        btnDelete.setFont(new Font("Arial", Font.PLAIN, 13));
        btnDelete.setForeground(Color.WHITE);
    }
}
