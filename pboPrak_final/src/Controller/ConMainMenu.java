package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*; 
import Model.ModelMain;

public class ConMainMenu {
    MainMenu mainMenu;
    InputData inputData; ConInputData conInputData;
    ViewData viewData; ConViewData conViewData;
    //InputTransc inputTransc; ConInputTransc conInputTransc;
    ModelMain model;

    public ConMainMenu(MainMenu mainMenu, ModelMain model) {
        this.mainMenu = mainMenu;
        this.model = model;

        /*mainMenu.btnTransc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputTransc = new InputTransc();
                conInputTransc = new ConInputTransc(inputTransc, model);
            }
            
        });*/

        mainMenu.btnInput.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputData = new InputData();
                conInputData = new ConInputData(inputData, model);
            }

        });

        mainMenu.btnView.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewData = new ViewData();
                conViewData = new ConViewData(viewData, model);
            }
            
        });
    }
}
