import Controller.ConMainMenu;
import Model.ModelMain;
import View.*;

public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        ModelMain model = new ModelMain();
        ConMainMenu conMainMenu = new ConMainMenu(mainMenu, model);
    }
}
