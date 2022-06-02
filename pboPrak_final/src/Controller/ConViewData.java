package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import View.ViewData; import View.UpdateData; 
import Model.ModelMain;

public class ConViewData {
    ViewData viewData; UpdateData updateData; ModelMain model;
    ConUpdateData conUpdateData;
    String selectedProductId; 

    public ConViewData(ViewData viewData, ModelMain model) {
        this.viewData = viewData;
        this.model = model;

        String dataProduct[][] = model.readProduct(); 
        viewData.table.setModel((new JTable(dataProduct, viewData.columnName)).getModel());

        viewData.btnReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String dataProduct[][] = model.readProduct();
                viewData.table.setModel((new JTable(dataProduct, viewData.columnName)).getModel());
            }

        });

        viewData.table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int row = viewData.table.getSelectedRow();
                // int col = viewData.table.getSelectedColumn();

                String selectedData = viewData.table.getValueAt(row,0).toString();
                String selectedProduct = viewData.table.getValueAt(row,1).toString();
                viewData.selectedData.setText(selectedProduct);
                setSelectedProductId(selectedData);
            }

        });

        viewData.btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                model.deleteProduct(getSelectedProductId());
            }

        });

        viewData.btnUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateData = new UpdateData(getSelectedProductId());
                conUpdateData = new ConUpdateData(updateData, model);
            }
            
        });
    }

    public void setSelectedProductId(String selectedProductId) {
        this.selectedProductId = selectedProductId;
    }

    public String getSelectedProductId() {
        return selectedProductId;
    }
}
