package org.example.laba.laba1.Abstract_Fabric;

public class WebFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new WebButton();
    }

    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    public Input createInput() {
        return new WebInput();
    }
}
