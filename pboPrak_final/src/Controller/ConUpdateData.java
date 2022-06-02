package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import View.UpdateData;
import Model.ModelMain;

public class ConUpdateData {
    UpdateData updateData;
    ModelMain model;

    public ConUpdateData(UpdateData updateData, ModelMain model) {
        this.updateData = updateData;
        this.model = model;

        updateData.btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int prod_id = Integer.parseInt(updateData.getId());
                    String prod_name = updateData.getName();
                    String prod_cat = updateData.getCat();
                    int prod_price = Integer.parseInt(updateData.getPrice());
                    int prod_quant = Integer.parseInt(updateData.getQuant());

                    model.updateProduct(prod_id, prod_name, prod_cat, prod_price, prod_quant);

                    JOptionPane.showMessageDialog(null, "Input Success");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Input Error: " + ex.getMessage());
                }
            }
            
        });
    }
}
