package by.peshkur.patterns.abstract_fabric.factories;

import by.peshkur.patterns.abstract_fabric.buttons.Button;
import by.peshkur.patterns.abstract_fabric.buttons.MacOSButton;
import by.peshkur.patterns.abstract_fabric.checkboxes.Checkbox;
import by.peshkur.patterns.abstract_fabric.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
