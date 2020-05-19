package by.peshkur.patterns.abstract_fabric.factories;

import by.peshkur.patterns.abstract_fabric.buttons.Button;
import by.peshkur.patterns.abstract_fabric.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
