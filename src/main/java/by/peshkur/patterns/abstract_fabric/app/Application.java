package by.peshkur.patterns.abstract_fabric.app;

import by.peshkur.patterns.abstract_fabric.buttons.Button;
import by.peshkur.patterns.abstract_fabric.checkboxes.Checkbox;
import by.peshkur.patterns.abstract_fabric.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
