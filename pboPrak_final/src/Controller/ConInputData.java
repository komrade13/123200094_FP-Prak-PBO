package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import Model.ModelMain;
import View.InputData;

public class ConInputData {
    InputData inputData;
    ModelMain model;

    public ConInputData(InputData inputData, ModelMain model) {
        this.inputData = inputData;
        this.model = model;

        inputData.btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int prod_id = Integer.parseInt(inputData.getId());
                    String prod_name = inputData.getName();
                    String prod_cat = inputData.getCat();
                    int prod_price = Integer.parseInt(inputData.getPrice());
                    int prod_quant = Integer.parseInt(inputData.getQuant());

                    model.insertProduct(prod_id, prod_name, prod_cat, prod_price, prod_quant);

                    JOptionPane.showMessageDialog(null, "Input Success");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Input Error: " + ex.getMessage());
                }

            }
            
        });
    }

}
