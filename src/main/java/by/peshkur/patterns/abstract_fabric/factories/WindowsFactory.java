package by.peshkur.patterns.abstract_fabric.factories;

import by.peshkur.patterns.abstract_fabric.buttons.Button;
import by.peshkur.patterns.abstract_fabric.buttons.WindowsButton;
import by.peshkur.patterns.abstract_fabric.checkboxes.Checkbox;
import by.peshkur.patterns.abstract_fabric.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
